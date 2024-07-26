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
@Table(name = "second_stage")
public class SecondStageJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "engines")
    private Integer engines;

    @Column(name = "fuel_amount_tons")
    private Double fuelAmountTons;

    @Column(name = "burn_time_sec")
    private Integer burnTimeSec;

    @ManyToOne
    @JoinColumn(name = "thrust_id")
    private ThrustStageJpa thrust;

    @ManyToOne
    @JoinColumn(name = "payloads_id")
    private PayloadsJpa payloads;
}
