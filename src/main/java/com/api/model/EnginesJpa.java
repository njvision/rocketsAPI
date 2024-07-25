package com.api.model;

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
public class EnginesJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer number;

    private String type;

    private String version;

    private String layout;

    @ManyToOne
    @JoinColumn(name = "isp_id")
    private IspJpa isp;

    private Integer engineLossMax;

    private String propellant1;

    private String propellant2;

    @ManyToOne
    @JoinColumn(name = "thrust_sea_level_id")
    private ThrustStageJpa thrustSeaLevel;

    @ManyToOne
    @JoinColumn(name = "thrust_sea_level_id")
    private ThrustStageJpa thrustVacuum;

    private Integer thrustToWeight;
}
