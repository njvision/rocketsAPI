package com.api.service;

import com.api.entity.SxRocket;
import com.api.mapper.RocketJpaMapper;
import com.api.model.RocketJpa;
import com.api.repository.RocketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

    public List<SxRocket> getRockets(int page, int limit) {

        Pageable pageable = PageRequest.of(page, limit);
        Page<RocketJpa> rocketJpaPage = rocketRepository.findAll(pageable);
        return rocketJpaPage.getContent().stream()
                .map(rocketJpaMapper::toDto)
                .collect(Collectors.toList());
    }
}
