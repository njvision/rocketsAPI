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

@AllArgsConstructor
@NoArgsConstructor
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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "thrust_id")
    private ThrustStageJpa thrust;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payloads_id")
    private PayloadsJpa payloads;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEngines() {
        return engines;
    }

    public void setEngines(Integer engines) {
        this.engines = engines;
    }

    public Double getFuelAmountTons() {
        return fuelAmountTons;
    }

    public void setFuelAmountTons(Double fuelAmountTons) {
        this.fuelAmountTons = fuelAmountTons;
    }

    public Integer getBurnTimeSec() {
        return burnTimeSec;
    }

    public void setBurnTimeSec(Integer burnTimeSec) {
        this.burnTimeSec = burnTimeSec;
    }

    public ThrustStageJpa getThrust() {
        return thrust;
    }

    public void setThrust(ThrustStageJpa thrust) {
        this.thrust = thrust;
    }

    public PayloadsJpa getPayloads() {
        return payloads;
    }

    public void setPayloads(PayloadsJpa payloads) {
        this.payloads = payloads;
    }
}
