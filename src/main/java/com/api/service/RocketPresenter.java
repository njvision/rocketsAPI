package com.api.service;

import com.api.dto.RocketDto;
import com.api.entity.SxRocket;
import com.api.mapper.RocketMapper;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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

    public Mono<List<RocketDto>> getAllRockets(Boolean idParam, Integer limitParam, Integer offsetParam) {
        Flux<SxRocket> rocketFlux = networkingService.getRockets(limitParam, offsetParam);
        return rocketFlux.collectList()
                .map(rockets -> {
                    List<RocketDto> rocketDtoList;
                    if(idParam) {
                        rocketDtoList = rockets.stream()
                                .map(rocketMapper::toDtoRocketMongoId)
                                .collect(Collectors.toList());
                    } else {
                        rocketDtoList = rockets.stream()
                                .map(rocketMapper::toDto)
                                .collect(Collectors.toList());
                    }
                    return filterByParams(rocketDtoList, limitParam, offsetParam);
                });
    }

    public Mono<RocketDto> getRocketById(String rocketId, Boolean idParam) {
        Mono<SxRocket> rocketFlux = networkingService.getRocket(rocketId);

        return rocketFlux.map(rocket -> {
            if(idParam) {
                return rocketMapper.toDtoRocketMongoId(rocket);
            } else {
                return rocketMapper.toDto(rocket);
            }
        });
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
