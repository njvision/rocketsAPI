package com.api.model;

import jakarta.persistence.Column;
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
@Table(name = "engines")
public class EnginesJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "number")
    private Integer number;

    @Column(name = "type")
    private String type;

    @Column(name = "version")
    private String version;

    @Column(name = "layout")
    private String layout;

    @ManyToOne
    @JoinColumn(name = "isp_id")
    private IspJpa isp;

    @Column(name = "engine_loss_max")
    private Integer engineLossMax;

    @Column(name = "propellant_1")
    private String propellant1;

    @Column(name = "propellant_2")
    private String propellant2;

    @ManyToOne
    @JoinColumn(name = "thrust_sea_level_id", referencedColumnName = "id")
    private ThrustStageJpa thrustSeaLevel;

    @ManyToOne
    @JoinColumn(name = "thrust_vacuum_id", referencedColumnName = "id")
    private ThrustStageJpa thrustVacuum;

    @Column(name = "thrust_to_weight")
    private Integer thrustToWeight;
}
