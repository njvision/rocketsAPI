package com.api.controller;

import com.api.dto.RocketDto;
import com.api.entity.SxRocket;
import com.api.service.RocketPersistenceService;
import com.api.service.RocketPresenter;
import com.api.service.RocketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class RocketController {

    private final RocketPresenter rocketPresenter;
    private final RocketPersistenceService rocketPersistenceService;
    private final RocketService rocketService;

    public RocketController(RocketPresenter rocketPresenter, RocketPersistenceService rocketPersistenceService, RocketService rocketService) {
        this.rocketPresenter = rocketPresenter;
        this.rocketPersistenceService = rocketPersistenceService;
        this.rocketService = rocketService;
    }

    @GetMapping
    public List<RocketDto> getAllRockets(
            @RequestParam(value = "id", required = false) Boolean idParam,
            @RequestParam(value = "limit", required = false) Integer limitParam,
            @RequestParam(value = "offset", required = false) Integer offsetParam
    ) {

        List<RocketDto> rocketDtoList = rocketPresenter.getAllRockets(idParam, limitParam, offsetParam);
        List<SxRocket> sxRocketList = rocketService.getRockets(rocketDtoList);

        System.out.println(sxRocketList.get(0).getFlickrImages());
        rocketPersistenceService.saveRockets(sxRocketList);
        return rocketDtoList;
    }

    @GetMapping("/{rocket_id}")
    public RocketDto getRocketById(@PathVariable("rocket_id") String rocketId,
                                   @RequestParam(value = "id", required = false) Boolean idParam) {

        return rocketPresenter.getRocketById(rocketId, idParam);
    }
}
