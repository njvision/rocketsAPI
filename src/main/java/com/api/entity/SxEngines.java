package com.api.entity;

import com.api.dto.Isp;
import com.api.dto.ThrustStage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SxEngines {
    private int number;
    private String type;
    private String version;
    private String layout;
    private Isp isp;
    private int engine_loss_max;
    private String propellant_1;
    private String propellant_2;
    private SxThrustStage thrust_sea_level;
    private SxThrustStage thrust_vacuum;
    private int thrust_to_weight;
}
