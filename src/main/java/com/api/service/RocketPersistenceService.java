package com.api.service;

import com.api.entity.SxRocket;
import com.api.mapper.RocketJpaMapper;
import com.api.model.RocketJpa;
import com.api.repository.RocketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RocketPersistenceService {

    private final RocketJpaMapper rocketJpaMapper;
    private final RocketRepository rocketRepository;

    public RocketPersistenceService(RocketJpaMapper rocketJpaMapper, RocketRepository rocketRepository) {
        this.rocketJpaMapper = rocketJpaMapper;
        this.rocketRepository = rocketRepository;
    }

    public void saveRockets (List<SxRocket> rockets) {
        List<RocketJpa> rocketJpa = rockets.stream()
                .map(rocketJpaMapper::toDto)
                .collect(Collectors.toList());

        rocketRepository.saveAll(rocketJpa);
    }
}
