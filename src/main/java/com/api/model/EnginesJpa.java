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
@Table(name = "engines")
public class EnginesJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "number")
    private Integer number;

    @Column(name = "type")
    private String type;

    @Column(name = "version")
    private String version;

    @Column(name = "layout")
    private String layout;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "isp_id")
    private IspJpa isp;

    @Column(name = "engine_loss_max")
    private Integer engineLossMax;

    @Column(name = "propellant_1")
    private String propellant1;

    @Column(name = "propellant_2")
    private String propellant2;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "thrust_sea_level_id", referencedColumnName = "id")
    private ThrustStageJpa thrustSeaLevel;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "thrust_vacuum_id", referencedColumnName = "id")
    private ThrustStageJpa thrustVacuum;

    @Column(name = "thrust_to_weight")
    private Integer thrustToWeight;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public IspJpa getIsp() {
        return isp;
    }

    public void setIsp(IspJpa isp) {
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

    public ThrustStageJpa getThrustSeaLevel() {
        return thrustSeaLevel;
    }

    public void setThrustSeaLevel(ThrustStageJpa thrustSeaLevel) {
        this.thrustSeaLevel = thrustSeaLevel;
    }

    public ThrustStageJpa getThrustVacuum() {
        return thrustVacuum;
    }

    public void setThrustVacuum(ThrustStageJpa thrustVacuum) {
        this.thrustVacuum = thrustVacuum;
    }

    public Integer getThrustToWeight() {
        return thrustToWeight;
    }

    public void setThrustToWeight(Integer thrustToWeight) {
        this.thrustToWeight = thrustToWeight;
    }
}
