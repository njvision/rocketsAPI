package com.api.entity;

import com.api.dto.Isp;
import com.api.dto.ThrustStage;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "sx_engines")
public class SxEngines {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonProperty("number")
    private Integer number;

    @JsonProperty("type")
    private String type;

    @JsonProperty("version")
    private String version;

    @JsonProperty("layout")
    private String layout;

    @ManyToOne
    @JoinColumn(name = "isp_id")
    @JsonProperty("isp")
    private SxIsp isp;

    @JsonProperty("engine_loss_max")
    private Integer engineLossMax;

    @JsonProperty("propellant_1")
    private String propellant1;

    @JsonProperty("propellant_2")
    private String propellant2;

    @ManyToOne
    @JoinColumn(name = "thrust_sea_level_id")
    @JsonProperty("thrust_sea_level")
    private SxThrustStage thrustSeaLevel;

    @ManyToOne
    @JoinColumn(name = "thrust_sea_level_id")
    @JsonProperty("thrust_vacuum_id")
    private SxThrustStage thrustVacuum;

    @JsonProperty("thrust_to_weight")
    private Integer thrustToWeight;
}
