package com.api.entity;

import com.api.dto.ThrustStage;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SxFirstStage {
    @JsonProperty("reusable")
    private Boolean reusable;

    @JsonProperty("engines")
    private int engines;

    @JsonProperty("fuel_amount_tons")
    private double fuelAmountTons;

    @JsonProperty("burn_time_sec")
    private long burnTimeSec;

    @JsonProperty("thrust_sea_level")
    private SxThrustStage thrustSeaLevel;

    @JsonProperty("thrust_vacuum")
    private SxThrustStage thrustVacuum;
}
