package com.api.entity;

import com.api.dto.Isp;
import com.api.dto.ThrustStage;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class SxEngines {
    @JsonProperty("number")
    private Integer number;

    @JsonProperty("type")
    private String type;

    @JsonProperty("version")
    private String version;

    @JsonProperty("layout")
    private String layout;

    @JsonProperty("isp")
    private SxIsp isp;

    @JsonProperty("engine_loss_max")
    private Integer engineLossMax;

    @JsonProperty("propellant_1")
    private String propellant1;

    @JsonProperty("propellant_2")
    private String propellant2;

    @JsonProperty("thrust_sea_level")
    private SxThrustStage thrustSeaLevel;

    @JsonProperty("thrust_vacuum")
    private SxThrustStage thrustVacuum;

    @JsonProperty("thrust_to_weight")
    private Integer thrustToWeight;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public SxIsp getIsp() {
        return isp;
    }

    public void setIsp(SxIsp isp) {
        this.isp = isp;
    }

    public Integer getEngineLossMax() {
        return engineLossMax;
    }

    public void setEngineLossMax(Integer engineLossMax) {
        this.engineLossMax = engineLossMax;
    }

    public String getPropellant1() {
        return propellant1;
    }

    public void setPropellant1(String propellant1) {
        this.propellant1 = propellant1;
    }

    public String getPropellant2() {
        return propellant2;
    }

    public void setPropellant2(String propellant2) {
        this.propellant2 = propellant2;
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

    public Integer getThrustToWeight() {
        return thrustToWeight;
    }

    public void setThrustToWeight(Integer thrustToWeight) {
        this.thrustToWeight = thrustToWeight;
    }
}
