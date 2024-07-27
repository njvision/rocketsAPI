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
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "rocket")
public class RocketJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

//    @Column(name = "_id")
//    public String _id;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "stages")
    private Integer stages;

    @Column(name = "boosters")
    private Integer boosters;

    @Column(name = "cost_per_launch")
    private Integer costPerLaunch;

    @Column(name = "success_rate_pct")
    private Integer successRatePct;

    @Column(name = "first_flight")
    private String firstFlight;

    @Column(name = "country")
    private String country;

    @Column(name = "company")
    private String company;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "height_id")
    private DimensionRocketJpa height;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "diameter_id")
    private DimensionRocketJpa diameter;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mass_id")
    private MassRocketJpa mass;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "first_stage_id")
    private FirstStageJpa firstStage;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "second_stage_id")
    private SecondStageJpa secondStage;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "engines_id")
    private EnginesJpa engines;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "landing_legs_id")
    private LandingLegsJpa landingLegs;

    @Column(name = "wikipedia", columnDefinition = "TEXT")
    private String wikipedia;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "rocket_id")
    private String rocketId;

    @Column(name = "rocket_name")
    private String rocketName;

    @Column(name = "rocket_type")
    private String rocketType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getStages() {
        return stages;
    }

    public void setStages(Integer stages) {
        this.stages = stages;
    }

    public Integer getBoosters() {
        return boosters;
    }

    public void setBoosters(Integer boosters) {
        this.boosters = boosters;
    }

    public Integer getCostPerLaunch() {
        return costPerLaunch;
    }

    public void setCostPerLaunch(Integer costPerLaunch) {
        this.costPerLaunch = costPerLaunch;
    }

    public Integer getSuccessRatePct() {
        return successRatePct;
    }

    public void setSuccessRatePct(Integer successRatePct) {
        this.successRatePct = successRatePct;
    }

    public String getFirstFlight() {
        return firstFlight;
    }

    public void setFirstFlight(String firstFlight) {
        this.firstFlight = firstFlight;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public DimensionRocketJpa getHeight() {
        return height;
    }

    public void setHeight(DimensionRocketJpa height) {
        this.height = height;
    }

    public DimensionRocketJpa getDiameter() {
        return diameter;
    }

    public void setDiameter(DimensionRocketJpa diameter) {
        this.diameter = diameter;
    }

    public MassRocketJpa getMass() {
        return mass;
    }

    public void setMass(MassRocketJpa mass) {
        this.mass = mass;
    }

    public FirstStageJpa getFirstStage() {
        return firstStage;
    }

    public void setFirstStage(FirstStageJpa firstStage) {
        this.firstStage = firstStage;
    }

    public SecondStageJpa getSecondStage() {
        return secondStage;
    }

    public void setSecondStage(SecondStageJpa secondStage) {
        this.secondStage = secondStage;
    }

    public EnginesJpa getEngines() {
        return engines;
    }

    public void setEngines(EnginesJpa engines) {
        this.engines = engines;
    }

    public LandingLegsJpa getLandingLegs() {
        return landingLegs;
    }

    public void setLandingLegs(LandingLegsJpa landingLegs) {
        this.landingLegs = landingLegs;
    }

    public String getWikipedia() {
        return wikipedia;
    }

    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRocketId() {
        return rocketId;
    }

    public void setRocketId(String rocketId) {
        this.rocketId = rocketId;
    }

    public String getRocketName() {
        return rocketName;
    }

    public void setRocketName(String rocketName) {
        this.rocketName = rocketName;
    }

    public String getRocketType() {
        return rocketType;
    }

    public void setRocketType(String rocketType) {
        this.rocketType = rocketType;
    }

}
