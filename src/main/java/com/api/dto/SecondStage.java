package com.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SecondStage {
    private Boolean reusable;
    private int engines;
    private double fuel_amount_tons;
    private int burn_time_sec;
    private ThrustStage thrust;
    private Payloads payloads;
}
