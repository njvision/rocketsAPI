package com.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class SxSecondStage {

    @JsonProperty("engines")
    private Integer engines;

    @JsonProperty("fuel_amount_tons")
    private Double fuelAmountTons;

    @JsonProperty("burn_time_sec")
    private Integer burnTimeSec;

    @JsonProperty("thrust")
    private SxThrustStage thrust;

    @JsonProperty("payloads")
    private SxPayloads payloads;

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

    public SxThrustStage getThrust() {
        return thrust;
    }

    public void setThrust(SxThrustStage thrust) {
        this.thrust = thrust;
    }

    public SxPayloads getPayloads() {
        return payloads;
    }

    public void setPayloads(SxPayloads payloads) {
        this.payloads = payloads;
    }
}
