package com.api.entity;

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
public class SxRocket {

    @JsonProperty("_id")
    private String _id;

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
    private SxDimensionRocket height;

    @JsonProperty("diameter")
    private SxDimensionRocket diameter;

    @JsonProperty("mass")
    private SxMassRocket mass;

    @JsonProperty("payload_weights")
    private List<SxPayloadWeights> payloadWeights;

    @JsonProperty("first_stage")
    private SxFirstStage firstStage;

    @JsonProperty("second_stage")
    private SxSecondStage secondStage;

    @JsonProperty("engines")
    private SxEngines engines;

    @JsonProperty("landing_legs")
    private SxLandingLegs landingLegs;

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
