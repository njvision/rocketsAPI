package com.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FirstStageDto {

    @JsonProperty("reusable")
    private Boolean reusable;

    @JsonProperty("engines")
    private Integer engines;

    @JsonProperty("fuel_amount_tons")
    private Double fuelAmountTons;

    @JsonProperty("burn_time_sec")
    private Integer burnTimeSec;

    @JsonProperty("thrust_sea_level")
    private ThrustStageDto thrustSeaLevel;

    @JsonProperty("thrust_vacuum")
    private ThrustStageDto thrustVacuum;
}
