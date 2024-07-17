package com.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class FirstStage {

    @JsonProperty("reusable")
    private Boolean reusable;

    @JsonProperty("engines")
    private int engines;

    @JsonProperty("fuel_amount_tons")
    private double fuelAmountTons;

    @JsonProperty("burn_time_sec")
    private long burnTimeSec;

    @JsonProperty("thrust_sea_level")
    private ThrustStage thrustSeaLevel;

    @JsonProperty("thrust_vacuum")
    private ThrustStage thrustVacuum;
}
