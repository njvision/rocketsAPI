package com.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class FirstStage {
    private Boolean reusable;
    private int engines;
    private double fuel_amount_tons;
    private long burn_time_sec;
    private ThrustStage thrust_sea_level;
    private ThrustStage thrust_vacuum;
}
