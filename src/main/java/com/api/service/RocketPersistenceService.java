package com.api.service;

import com.api.dto.RocketDto;
import com.api.mapper.JPARocketMapper;
import com.api.model.RocketJpa;
import com.api.repository.RocketRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RocketPersistenceService {

    private final JPARocketMapper JPARocketMapper;
    private final RocketRepository rocketRepository;

    public RocketPersistenceService(JPARocketMapper JPARocketMapper, RocketRepository rocketRepository) {
        this.JPARocketMapper = JPARocketMapper;
        this.rocketRepository = rocketRepository;
    }

    public void saveRockets (List<RocketDto> rockets) {
        List<RocketJpa> rocketJpa = rockets.stream()
                .map(JPARocketMapper::toDto)
                .collect(Collectors.toList());

        rocketRepository.saveAll(rocketJpa);
    }

    public List<RocketDto> getRockets(int page, int limit) {

        Pageable pageable = PageRequest.of(page, limit);
        Page<RocketJpa> rocketJpaPage = rocketRepository.findAll(pageable);
        return rocketJpaPage.getContent().stream()
                .map(JPARocketMapper::toDto)
                .collect(Collectors.toList());
    }
}
