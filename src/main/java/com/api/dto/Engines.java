package com.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Engines {
    private int number;
    private String type;
    private String version;
    private String layout;
    private Isp isp;
    private int engine_loss_max;
    private String propellant_1;
    private String propellant_2;
    private ThrustStage thrust_sea_level;
    private ThrustStage thrust_vacuum;
    private int thrust_to_weight;
}
