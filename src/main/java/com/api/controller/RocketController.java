package com.api.controller;

import com.api.dto.RocketDto;
import com.api.service.RocketPresenter;
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

    public RocketController(RocketPresenter rocketPresenter) {
        this.rocketPresenter = rocketPresenter;
    }

    @GetMapping
    public List<RocketDto> getAllRockets(
            @RequestParam(value = "id", required = false) Boolean idParam,
            @RequestParam(value = "limit", required = false) Integer limitParam,
            @RequestParam(value = "offset", required = false) Integer offsetParam
    ) {
        return rocketPresenter.getAllRockets(idParam, limitParam, offsetParam);
    }

    @GetMapping("/{rocket_id}")
    public RocketDto getRocketById(@PathVariable("rocket_id") String rocketId,
                                   @RequestParam(value = "id", required = false) Boolean idParam) {

        return rocketPresenter.getRocketById(rocketId, idParam);
    }
}
