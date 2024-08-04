package com.api.specification;

import com.api.model.RocketJpa;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class RocketSpecification {

    //   by id, cost_per_launch, height, mass, stages, country and filter by first_flight from date to date.

    public static Specification<RocketJpa> filterById(String id) {
        return (root, query, criteriaBuilder) -> {
            if (StringUtils.hasText(id)) {
                Integer rocketId;
                try {
                    rocketId = Integer.parseInt(id);
                } catch (NumberFormatException e) {
                    return criteriaBuilder.conjunction();
                }
                return criteriaBuilder.equal(root.get("id"), rocketId);
            } else {
                return criteriaBuilder.conjunction();
            }
        };
    }

    public static Specification<RocketJpa> filterByCountry(String country) {
        return (root, query, criteriaBuilder) ->
                StringUtils.hasText(country) ? criteriaBuilder.equal(root.get("country"), country) : criteriaBuilder.conjunction();
    }

    public static Specification<RocketJpa> filterByCostPerLaunch(String costPerLaunch) {
        Integer costPerLaunchNumber = StringUtils.hasText(costPerLaunch) ? Integer.parseInt(costPerLaunch) : null;

        return (root, query, criteriaBuilder) -> {
            if (Objects.nonNull(costPerLaunchNumber)) {
                return criteriaBuilder.greaterThanOrEqualTo(root.get("costPerLaunch"), costPerLaunchNumber);
            } else {
                return criteriaBuilder.conjunction();
            }
        };
    }

    public static Specification<RocketJpa> filterByFirstFlight(String firstFlightFrom, String firstFlightTo) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate fromDate = StringUtils.hasText(firstFlightFrom) ? LocalDate.parse(firstFlightFrom, formatter) : null;
        LocalDate toDate = StringUtils.hasText(firstFlightTo) ? LocalDate.parse(firstFlightTo, formatter) : null;

        return (root, query, criteriaBuilder) -> {
            if (Objects.nonNull(fromDate) && Objects.nonNull(toDate)) {
                return criteriaBuilder.between(root.get("firstFlight"), fromDate, toDate);
            } else if (Objects.nonNull(fromDate)) {
                return criteriaBuilder.greaterThanOrEqualTo(root.get("firstFlight"), fromDate);
            } else if (Objects.nonNull(toDate)) {
                return criteriaBuilder.lessThanOrEqualTo(root.get("firstFlight"), toDate);
            } else {
                return criteriaBuilder.conjunction();
            }
        };
    }
}
