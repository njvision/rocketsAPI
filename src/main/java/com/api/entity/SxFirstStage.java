package com.api.entity;

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
@Table(name = "sx_first_stage")
public class SxFirstStage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonProperty("reusable")
    private Boolean reusable;

    @JsonProperty("engines")
    private Integer engines;

    @JsonProperty("fuel_amount_tons")
    private Double fuelAmountTons;

    @JsonProperty("burn_time_sec")
    private Integer burnTimeSec;

    @ManyToOne
    @JoinColumn(name = "thrust_sea_level_id")
    @JsonProperty("thrust_sea_level")
    private SxThrustStage thrustSeaLevel;

    @ManyToOne
    @JoinColumn(name = "thrust_vacuum_id")
    @JsonProperty("thrust_vacuum")
    private SxThrustStage thrustVacuum;
}
