package com.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RocketDto {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("active")
    private Boolean active;

    @JsonProperty("stages")
    private Integer stages;

    @JsonProperty("boosters")
    private Integer boosters;

    @JsonProperty("cost_per_launch")
    private Integer costPerLaunch;

    @JsonProperty("success_rate_pct")
    private Integer successRatePct;

    @JsonProperty("first_flight")
    private LocalDate firstFlight;

    @JsonProperty("country")
    private String country;

    @JsonProperty("company")
    private String company;

    @JsonProperty("height")
    private DimensionRocketDto height;

    @JsonProperty("diameter")
    private DimensionRocketDto diameter;

    @JsonProperty("mass")
    private MassRocketDto mass;

    @JsonProperty("payload_weights")
    private List<PayloadWeightsDto> payloadWeights;

    @JsonProperty("first_stage")
    private FirstStageDto firstStage;

    @JsonProperty("second_stage")
    private SecondStageDto secondStage;

    @JsonProperty("engines")
    private EnginesDto engines;

    @JsonProperty("landing_legs")
    private LandingLegsDto landingLegs;

    @JsonProperty("flickr_images")
    private List<String> flickrImages;

    @JsonProperty("wikipedia")
    private String wikipedia;

    @JsonProperty("description")
    private String description;

    @JsonProperty("rocket_id")
    private String rocketId;

    @JsonProperty("rocket_name")
    private String rocketName;

    @JsonProperty("rocket_type")
    private String rocketType;
}
