package com.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SecondStage {

    @JsonProperty("reusable")
    private Boolean reusable;

    @JsonProperty("engines")
    private int engines;

    @JsonProperty("fuel_amount_tons")
    private double fuelAmountTons;

    @JsonProperty("burn_time_sec")
    private int burnTimeSec;

    @JsonProperty("thrust")
    private ThrustStage thrust;

    @JsonProperty("payloads")
    private Payloads payloads;
}
