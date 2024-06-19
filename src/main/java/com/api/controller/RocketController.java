package com.api.controller;

import com.api.dto.RocketDto;
import com.api.entity.SX_Rocket;
import com.api.mapper.RocketMapper;
import com.api.service.NetworkingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping
public class RocketController {

    private final NetworkingService networkingService;
    private final RocketMapper rocketMapper;

    public RocketController(NetworkingService networkingService, RocketMapper rocketMapper) {
        this.networkingService = networkingService;
        this.rocketMapper = rocketMapper;
    }

    @GetMapping
    public Mono<List<RocketDto>> getAllRockets(
            @RequestParam(value = "id", required = false, defaultValue = "false") Boolean idParam,
            @RequestParam(value = "limit", required = false, defaultValue = "0") Integer limitParam,
            @RequestParam(value = "offset", required = false, defaultValue = "0") Integer offsetParam
    ) {
        Flux<SX_Rocket> rocketFlux = networkingService.getRockets();
        return rocketFlux.collectList()
                .map(rockets -> {
                    List<RocketDto> rocketDtoList;
                    if(idParam) {
                        rocketDtoList = rockets.stream()
                                .map(rocketMapper::toDtoRocketMongoId)
                                .collect(Collectors.toList());
                    } else {
                        rocketDtoList = rockets.stream()
                                .map(rocketMapper::toDtoRocket)
                                .collect(Collectors.toList());
                    }
                    return filterByParams(rocketDtoList, limitParam, offsetParam);
        });
    }

    @GetMapping("/{rocket_id}")
    public Mono<RocketDto> getRocketById(@PathVariable("rocket_id") String rocketId,
                                         @RequestParam(value = "id", required = false, defaultValue = "false") Boolean idParam) {

        Mono<SX_Rocket> rocketFlux = networkingService.getRocket(rocketId);

        return rocketFlux.map(rocket -> {
            if(idParam) {
                return rocketMapper.toDtoRocketMongoId(rocket);
            } else {
                return rocketMapper.toDtoRocket(rocket);
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
