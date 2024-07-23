package com.api.entity;

import com.api.dto.DimensionRocket;
import com.api.dto.Engines;
import com.api.dto.FirstStage;
import com.api.dto.LandingLegs;
import com.api.dto.MassRocket;
import com.api.dto.PayloadWeights;
import com.api.dto.SecondStage;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "sx_rocket")
public class SxRocket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("_id")
    public String _id;

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
    private String firstFlight;

    @JsonProperty("country")
    private String country;

    @JsonProperty("company")
    private String company;

    @ManyToOne
    @JoinColumn(name = "height_id")
    @JsonProperty("height")
    private SxDimensionRocket height;

    @ManyToOne
    @JoinColumn(name = "diameter_id")
    @JsonProperty("diameter")
    private SxDimensionRocket diameter;

    @ManyToOne
    @JoinColumn(name = "mass_id")
    @JsonProperty("mass")
    private SxMassRocket mass;

    @ManyToOne
    @JoinColumn(name = "first_stage_id")
    @JsonProperty("first_stage")
    private SxFirstStage firstStage;

    @ManyToOne
    @JoinColumn(name = "second_stage_id")
    @JsonProperty("second_stage")
    private SxSecondStage secondStage;

    @ManyToOne
    @JoinColumn(name = "engines_id")
    @JsonProperty("engines")
    private SxEngines engines;

    @ManyToOne
    @JoinColumn(name = "landing_legs_id")
    @JsonProperty("landing_legs")
    private SxLandingLegs landingLegs;

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
