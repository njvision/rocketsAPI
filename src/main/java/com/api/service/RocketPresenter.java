package com.api.service;

import com.api.dto.RocketDto;
import com.api.entity.SxRocket;
import com.api.mapper.RocketMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RocketPresenter {

    private final NetworkingService networkingService;
    private final RocketMapper rocketMapper;

    public RocketPresenter(NetworkingService networkingService, RocketMapper rocketMapper) {
        this.networkingService = networkingService;
        this.rocketMapper = rocketMapper;
    }

    public List<RocketDto> getAllRockets(Boolean idParam, Integer limitParam, Integer offsetParam) {
        List<SxRocket> rockets = networkingService.getRockets(limitParam, offsetParam);
        List<RocketDto> rocketDtoList;
        if (idParam) {
            rocketDtoList = rockets.stream()
                    .map(rocketMapper::toDtoRocketMongoId)
                    .collect(Collectors.toList());
        } else {
            rocketDtoList = rockets.stream()
                    .map(rocketMapper::toDto)
                    .collect(Collectors.toList());
        }
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
