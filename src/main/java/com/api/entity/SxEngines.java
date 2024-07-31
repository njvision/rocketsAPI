package com.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SxEngines {
    @JsonProperty("number")
    private Integer number;

    @JsonProperty("type")
    private String type;

    @JsonProperty("version")
    private String version;

    @JsonProperty("layout")
    private String layout;

    @JsonProperty("isp")
    private SxIsp isp;

    @JsonProperty("engine_loss_max")
    private Integer engineLossMax;

    @JsonProperty("propellant_1")
    private String propellant1;

    @JsonProperty("propellant_2")
    private String propellant2;

    @JsonProperty("thrust_sea_level")
    private SxThrustStage thrustSeaLevel;

    @JsonProperty("thrust_vacuum")
    private SxThrustStage thrustVacuum;

    @JsonProperty("thrust_to_weight")
    private Integer thrustToWeight;
}
