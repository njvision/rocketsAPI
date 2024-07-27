package com.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Engines {

    @JsonProperty("number")
    private Integer number;

    @JsonProperty("type")
    private String type;

    @JsonProperty("version")
    private String version;

    @JsonProperty("layout")
    private String layout;

    @JsonProperty("isp")
    private Isp isp;

    @JsonProperty("engine_loss_max")
    private Integer engineLossMax;

    @JsonProperty("propellant_1")
    private String propellant1;

    @JsonProperty("propellant_2")
    private String propellant2;

    @JsonProperty("thrust_sea_level")
    private ThrustStage thrustSeaLevel;

    @JsonProperty("thrust_vacuum")
    private ThrustStage thrustVacuum;

    @JsonProperty("thrust_to_weight")
    private Integer thrustToWeight;

    public Integer getThrustToWeight() {
        return thrustToWeight;
    }

    public void setThrustToWeight(Integer thrustToWeight) {
        this.thrustToWeight = thrustToWeight;
    }

    public ThrustStage getThrustVacuum() {
        return thrustVacuum;
    }

    public void setThrustVacuum(ThrustStage thrustVacuum) {
        this.thrustVacuum = thrustVacuum;
    }

    public ThrustStage getThrustSeaLevel() {
        return thrustSeaLevel;
    }

    public void setThrustSeaLevel(ThrustStage thrustSeaLevel) {
        this.thrustSeaLevel = thrustSeaLevel;
    }

    public String getPropellant2() {
        return propellant2;
    }

    public void setPropellant2(String propellant2) {
        this.propellant2 = propellant2;
    }

    public String getPropellant1() {
        return propellant1;
    }

    public void setPropellant1(String propellant1) {
        this.propellant1 = propellant1;
    }

    public Integer getEngineLossMax() {
        return engineLossMax;
    }

    public void setEngineLossMax(Integer engineLossMax) {
        this.engineLossMax = engineLossMax;
    }

    public Isp getIsp() {
        return isp;
    }

    public void setIsp(Isp isp) {
        this.isp = isp;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
