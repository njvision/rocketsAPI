package com.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class RocketDto {

    private int id;
    private Boolean active;
    private int stages;
    private int boosters;
    private long cost_per_launch;
    private int success_rate_pct;
    private String first_flight;
    private String country;
    private String company;
    private DimensionRocket height;
    private DimensionRocket diameter;
    private MassRocket mass;
    private List<PayloadWeights> payload_weights;
    private FirstStage first_stage;
    private SecondStage second_stage;
    private Engines engines;
    private LandingLegs landing_legs;
    private List<String> flickr_images;
    private String wikipedia;
    private String description;
    private String rocket_id;
    private String rocket_name;
    private String rocket_type;
}
