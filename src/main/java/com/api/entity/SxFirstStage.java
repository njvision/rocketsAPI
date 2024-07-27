package com.api.entity;

import com.api.dto.ThrustStage;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class SxFirstStage {
    @JsonProperty("reusable")
    private Boolean reusable;

    @JsonProperty("engines")
    private Integer engines;

    @JsonProperty("fuel_amount_tons")
    private Double fuelAmountTons;

    @JsonProperty("burn_time_sec")
    private Integer burnTimeSec;

    @JsonProperty("thrust_sea_level")
    private SxThrustStage thrustSeaLevel;

    @JsonProperty("thrust_vacuum")
    private SxThrustStage thrustVacuum;

    public Boolean getReusable() {
        return reusable;
    }

    public void setReusable(Boolean reusable) {
        this.reusable = reusable;
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

    public SxThrustStage getThrustSeaLevel() {
        return thrustSeaLevel;
    }

    public void setThrustSeaLevel(SxThrustStage thrustSeaLevel) {
        this.thrustSeaLevel = thrustSeaLevel;
    }

    public SxThrustStage getThrustVacuum() {
        return thrustVacuum;
    }

    public void setThrustVacuum(SxThrustStage thrustVacuum) {
        this.thrustVacuum = thrustVacuum;
    }
}
