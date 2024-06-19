package com.api.controller;

import com.api.dto.Rocket_DTO;
import com.api.dto.RocketMongoId_DTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping
public class RocketController {

    private static final String BASE_URL = "https://api.spacexdata.com/v3/rockets";
    private final RestTemplate restTemplate;

    public RocketController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public List<Rocket_DTO> getAllRockets(
            @RequestParam(value = "id", required = false) Boolean idParam,
            @RequestParam(value = "limit", required = false) Integer limitParam,
            @RequestParam(value = "offset", required = false) Integer offsetParam
    ) {
        Rocket_DTO[] rockets = restTemplate.getForObject(BASE_URL, Rocket_DTO[].class);
        Rocket_DTO[] rocketsMongoId = restTemplate.getForObject(BASE_URL, RocketMongoId_DTO[].class);

        if (Boolean.TRUE.equals(idParam) && rocketsMongoId != null) {
            List<Rocket_DTO> rocketsMongoIdList = Arrays.asList(rocketsMongoId);
            return filterByParams(rocketsMongoIdList, limitParam, offsetParam);
        }
        if (rockets != null) {
            List<Rocket_DTO> rocketList = Arrays.asList(rockets);
            return filterByParams(rocketList, limitParam, offsetParam);
        }

        return Collections.emptyList();
    }

    @GetMapping("/{rocket_id}")
    public Rocket_DTO getRocketById(@PathVariable("rocket_id") String rocketId,
                                    @RequestParam(value = "id", required = false) Boolean idParam) {
        if(Boolean.TRUE.equals(idParam)) {
            return restTemplate.getForObject(BASE_URL + "/" + rocketId, RocketMongoId_DTO.class);
        }
        return restTemplate.getForObject(BASE_URL + "/" + rocketId, Rocket_DTO.class);
    }

    private List<Rocket_DTO> filterByParams(List<Rocket_DTO> rocketList, Integer limitParam, Integer offsetParam) {
        if (limitParam != null && limitParam > 0) {
            return rocketList.stream().limit(limitParam).toList();
        }
        if (offsetParam != null && offsetParam > 0) {
            return rocketList.stream().skip(offsetParam).toList();
        }
        return rocketList;
    }
}
