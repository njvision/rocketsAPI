package com.api.entity;

import com.api.dto.DimensionRocket;
import com.api.dto.Engines;
import com.api.dto.FirstStage;
import com.api.dto.LandingLegs;
import com.api.dto.MassRocket;
import com.api.dto.PayloadWeights;
import com.api.dto.SecondStage;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SxRocket {

    @JsonProperty("_id")
    public String _id;

    @JsonProperty("id")
    private int id;

    @JsonProperty("active")
    private Boolean active;

    @JsonProperty("stages")
    private int stages;

    @JsonProperty("boosters")
    private int boosters;

    @JsonProperty("cost_per_launch")
    private long costPerLaunch;

    @JsonProperty("success_rate_pct")
    private int successRatePct;

    @JsonProperty("first_flight")
    private String firstFlight;

    @JsonProperty("country")
    private String country;

    @JsonProperty("company")
    private String company;

    @JsonProperty("height")
    private DimensionRocket height;

    @JsonProperty("diameter")
    private DimensionRocket diameter;

    @JsonProperty("mass")
    private MassRocket mass;

    @JsonProperty("payload_weights")
    private List<PayloadWeights> payloadWeights;

    @JsonProperty("first_stage")
    private FirstStage firstStage;

    @JsonProperty("second_stage")
    private SecondStage secondStage;

    @JsonProperty("engines")
    private Engines engines;

    @JsonProperty("landing_legs")
    private LandingLegs landingLegs;

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
