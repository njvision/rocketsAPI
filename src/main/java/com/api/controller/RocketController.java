package com.api.controller;

import com.api.config.PaginationProperties;
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
    private final PaginationProperties paginationProperties;

    public RocketController(RocketPresenter rocketPresenter, RocketPersistenceService rocketPersistenceService, RocketService rocketService, PaginationProperties paginationProperties) {
        this.rocketPresenter = rocketPresenter;
        this.rocketPersistenceService = rocketPersistenceService;
        this.rocketService = rocketService;
        this.paginationProperties = paginationProperties;
    }

    @GetMapping
    public List<RocketDto> getAllRockets(
            @RequestParam(value = "id", required = false) Boolean idParam,
            @RequestParam(value = "limit", required = false) Integer limitParam,
            @RequestParam(value = "offset", required = false) Integer offsetParam
    ) {

        List<RocketDto> rocketDtoList = rocketPresenter.getAllRockets(idParam, limitParam, offsetParam);
        List<SxRocket> sxRocketList = rocketService.getRockets(rocketDtoList);
        rocketPersistenceService.saveRockets(sxRocketList);
        return rocketDtoList;
    }

    @GetMapping("/filter")
    public List<RocketDto> getRockets(
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "limit", defaultValue = "10") int limit,
            @RequestParam(value = "offset", defaultValue = "0") int offset) {

        if (offset > 0) {
            page = offset / limit;
        }

        page = Math.max(0, page);
        limit = Math.max(1, limit);

        List<SxRocket> sxRocketList = rocketPersistenceService.getRockets(page, limit);
        return rocketService.getFilteredRockets(sxRocketList);
    }

    @GetMapping("/{rocket_id}")
    public RocketDto getRocketById(@PathVariable("rocket_id") String rocketId,
                                   @RequestParam(value = "id", required = false) Boolean idParam) {

        return rocketPresenter.getRocketById(rocketId, idParam);
    }
}
