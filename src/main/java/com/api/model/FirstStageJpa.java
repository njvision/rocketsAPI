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
@Table(name = "sx_first_stage")
public class FirstStageJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Boolean reusable;

    private Integer engines;

    private Double fuelAmountTons;

    private Integer burnTimeSec;

    @ManyToOne
    @JoinColumn(name = "thrust_sea_level_id")
    private ThrustStageJpa thrustSeaLevel;

    @ManyToOne
    @JoinColumn(name = "thrust_vacuum_id")
    private ThrustStageJpa thrustVacuum;
}
