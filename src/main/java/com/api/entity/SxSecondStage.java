package com.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SxSecondStage {

    @JsonProperty("engines")
    private Integer engines;

    @JsonProperty("fuel_amount_tons")
    private Double fuelAmountTons;

    @JsonProperty("burn_time_sec")
    private Integer burnTimeSec;

    @JsonProperty("thrust")
    private SxThrustStage thrust;

    @JsonProperty("payloads")
    private SxPayloads payloads;
}
