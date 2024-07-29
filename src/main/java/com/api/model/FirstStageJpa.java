package com.api.model;

import jakarta.persistence.CascadeType;
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
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "first_stage")
public class FirstStageJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "reusable")
    private Boolean reusable;

    @Column(name = "engines")
    private Integer engines;

    @Column(name = "fuel_amount_tons")
    private Double fuelAmountTons;

    @Column(name = "burn_time_sec")
    private Integer burnTimeSec;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "thrust_sea_level_id")
    private ThrustStageJpa thrustSeaLevel;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "thrust_vacuum_id")
    private ThrustStageJpa thrustVacuum;
}
