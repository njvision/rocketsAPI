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
@Table(name = "sx_second_stage")
public class SecondStageJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer engines;

    private Double fuelAmountTons;

    private Integer burnTimeSec;

    @ManyToOne
    @JoinColumn(name = "thrust_id")
    private ThrustStageJpa thrust;

    @ManyToOne
    @JoinColumn(name = "payloads_id")
    private PayloadsJpa payloads;
}
