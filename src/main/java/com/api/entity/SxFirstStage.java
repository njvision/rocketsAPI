package com.api.entity;

import com.api.dto.ThrustStage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SxFirstStage {
    private Boolean reusable;
    private int engines;
    private double fuel_amount_tons;
    private long burn_time_sec;
    private SxThrustStage thrust_sea_level;
    private SxThrustStage thrust_vacuum;
}
