package com.api.entity;

import com.api.dto.Payloads;
import com.api.dto.ThrustStage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SxSecondStage {
    private Boolean reusable;
    private int engines;
    private double fuel_amount_tons;
    private int burn_time_sec;
    private SxThrustStage thrust;
    private SxPayloads payloads;
}
