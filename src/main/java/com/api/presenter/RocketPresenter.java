package com.api.presenter;

import com.api.dto.RocketDto;
import com.api.entity.SxRocket;
import com.api.mapper.RocketMapper;
import com.api.service.NetworkingService;
import com.api.service.RocketPersistenceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RocketPresenter {

    private final NetworkingService networkingService;
    private final RocketMapper rocketMapper;
    private final RocketPersistenceService rocketPersistenceService;

    public RocketPresenter(NetworkingService networkingService, RocketMapper rocketMapper, RocketPersistenceService rocketPersistenceService) {
        this.networkingService = networkingService;
        this.rocketMapper = rocketMapper;
        this.rocketPersistenceService = rocketPersistenceService;
    }

    public List<RocketDto> getAllRockets(Boolean idParam, Integer limitParam, Integer offsetParam) {
        List<SxRocket> rockets = networkingService.getRockets(limitParam, offsetParam);

        List<RocketDto> rocketDtoList;
        if (Optional.ofNullable(idParam).isPresent()) {
            rocketDtoList = rockets.stream()
                    .map(rocketMapper::toDtoRocketMongoId)
                    .collect(Collectors.toList());
        } else {
            rocketDtoList = rockets.stream()
                    .map(rocketMapper::toDto)
                    .collect(Collectors.toList());
        }

        rocketPersistenceService.saveRockets(rocketDtoList);
        return filterByParams(rocketDtoList, limitParam, offsetParam);
    }

    public RocketDto getRocketById(String rocketId, Boolean idParam) {
        SxRocket rocket = networkingService.getRocket(rocketId);

        if (idParam) {
            return rocketMapper.toDtoRocketMongoId(rocket);
        } else {
            return rocketMapper.toDto(rocket);
        }
    }

    public List<RocketDto> getFilteredRockets(Integer page, Integer limit, String sortBy, String sortOrder,
                                              String id, String country, String costPerLaunch, String firstFlightFrom, String firstFlightTo) {
        page = Math.max(0, page);
        limit = Math.max(1, limit);

        return rocketPersistenceService.getRockets(page, limit, sortBy, sortOrder, id, country, costPerLaunch, firstFlightFrom, firstFlightTo);
    }

    private List<RocketDto> filterByParams(List<RocketDto> rocketList, Integer limitParam, Integer offsetParam) {
        if (limitParam != null && limitParam > 0) {
            return rocketList.stream().limit(limitParam).toList();
        }
        if (offsetParam != null && offsetParam > 0) {
            return rocketList.stream().skip(offsetParam).toList();
        }
        return rocketList;
    }
}
