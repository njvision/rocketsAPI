package com.api.service;

import com.api.dto.RocketDto;
import com.api.entity.SxRocket;
import com.api.mapper.RocketMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RocketService {

    private RocketMapper mapper;

    public RocketService(RocketMapper mapper) {
        this.mapper = mapper;
    }

    public List<SxRocket> getRockets(List<RocketDto> rockets) {
        return rockets.stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }
}
