package com.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class FirstStage {

    @JsonProperty("reusable")
    private Boolean reusable;

    @JsonProperty("engines")
    private Integer engines;

    @JsonProperty("fuel_amount_tons")
    private Double fuelAmountTons;

    @JsonProperty("burn_time_sec")
    private Integer burnTimeSec;

    @JsonProperty("thrust_sea_level")
    private ThrustStage thrustSeaLevel;

    @JsonProperty("thrust_vacuum")
    private ThrustStage thrustVacuum;

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

    public ThrustStage getThrustSeaLevel() {
        return thrustSeaLevel;
    }

    public void setThrustSeaLevel(ThrustStage thrustSeaLevel) {
        this.thrustSeaLevel = thrustSeaLevel;
    }

    public ThrustStage getThrustVacuum() {
        return thrustVacuum;
    }

    public void setThrustVacuum(ThrustStage thrustVacuum) {
        this.thrustVacuum = thrustVacuum;
    }
}
