package com.api.specification;

import com.api.model.RocketJpa;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class RocketSpecification {

    //   height, mass,

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

        return filterGreaterEqualOrLessEqual(costPerLaunch, "costPerLaunch", "greater");
    }

    public static Specification<RocketJpa> filterByStages(String stages) {

        return filterGreaterEqualOrLessEqual(stages, "stages", "greater");
    }

    public static Specification<RocketJpa> filterByHeightMeters(Double metersFrom, Double metersTo) {
        return filterMetersAndFeet(metersFrom, metersTo, "height", "meters");
    }

    public static Specification<RocketJpa> filterByHeightFeet(Double feetFrom, Double feetTo) {
        return filterMetersAndFeet(feetFrom, feetTo, "height", "feet");
    }

    public static Specification<RocketJpa> filterByDiameterMeters(Double metersFrom, Double metersTo) {
        return filterMetersAndFeet(metersFrom, metersTo, "diameter", "meters");
    }

    public static Specification<RocketJpa> filterByDiameterFeet(Double feetFrom, Double feetTo) {
        return filterMetersAndFeet(feetFrom, feetTo, "diameter", "feet");
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

    private static Specification<RocketJpa> filterGreaterEqualOrLessEqual(String data, String column, String criteria) {
        Integer dataNumber = StringUtils.hasText(data) ? Integer.parseInt(data) : null;

        return (root, query, criteriaBuilder) -> {
            if (Objects.nonNull(dataNumber)) {
                if (criteria.equals("greater")) {
                    return criteriaBuilder.greaterThanOrEqualTo(root.get(column), dataNumber);
                } else if (criteria.equals("less")) {
                    return criteriaBuilder.lessThanOrEqualTo(root.get(column), dataNumber);
                } else {
                    return criteriaBuilder.equal(root.get(column), dataNumber);
                }
            } else {
                return criteriaBuilder.conjunction();
            }
        };
    }

    private static Specification<RocketJpa> filterMetersAndFeet(Double dataFrom, Double dataTo, String criteria, String dataName) {
        return (root, query, criteriaBuilder) -> {
            if (Objects.nonNull(dataFrom) && Objects.nonNull(dataTo)) {
                return criteriaBuilder.between(root.get(criteria).get(dataName), dataFrom, dataTo);
            } else if (Objects.nonNull(dataFrom)) {
                return criteriaBuilder.greaterThanOrEqualTo(root.get(criteria).get(dataName), dataFrom);
            } else if (Objects.nonNull(dataTo)) {
                return criteriaBuilder.lessThanOrEqualTo(root.get(criteria).get(dataName), dataTo);
            } else {
                return criteriaBuilder.conjunction();
            }
        };
    }
}
