package com.api.service;

import com.api.dto.RocketDto;
import com.api.mapper.JPARocketMapper;
import com.api.model.RocketJpa;
import com.api.repository.RocketRepository;
import com.api.specification.RocketSpecification;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

    public void saveRockets(List<RocketDto> rockets) {
        List<RocketJpa> rocketJpa = rockets.stream()
                .map(JPARocketMapper::toDto)
                .collect(Collectors.toList());

        rocketRepository.saveAll(rocketJpa);
    }

    public List<RocketDto> getRockets(int page, int limit, String sortBy, String sortOrder,
                                      String id, String country, String costPerLaunch, String stages,
                                      Double heightMetersFrom, Double heightMetersTo,
                                      Double heightFeetFrom, Double heightFeetTo,
                                      Double diameterMetersFrom, Double diameterMetersTo,
                                      Double diameterFeetFrom, Double diameterFeetTo,
                                      String firstFlightFrom, String firstFlightTo) {

        Sort sort = sortOrder.equalsIgnoreCase("desc") ? Sort.by(sortBy).descending() : Sort.by(sortBy).ascending();
        Pageable pageable = PageRequest.of(page, limit, sort);
        Page<RocketJpa> rocketJpaPage = rocketRepository.findAll(
                RocketSpecification.filterById(id)
                        .and(RocketSpecification.filterByCountry(country))
                        .and(RocketSpecification.filterByCostPerLaunch(costPerLaunch))
                        .and(RocketSpecification.filterByStages(stages))
                        .and(RocketSpecification.filterByHeightMeters(heightMetersFrom, heightMetersTo))
                        .and(RocketSpecification.filterByHeightFeet(heightFeetFrom, heightFeetTo))
                        .and(RocketSpecification.filterByDiameterMeters(diameterMetersFrom, diameterMetersTo))
                        .and(RocketSpecification.filterByDiameterFeet(diameterFeetFrom, diameterFeetTo))
                        .and(RocketSpecification.filterByFirstFlight(firstFlightFrom, firstFlightTo)),
                pageable);

        return rocketJpaPage.getContent().stream()
                .map(JPARocketMapper::toDto)
                .collect(Collectors.toList());
    }
}
