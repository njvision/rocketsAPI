package com.api.entity;

import com.api.dto.DimensionRocket;
import com.api.dto.Engines;
import com.api.dto.FirstStage;
import com.api.dto.LandingLegs;
import com.api.dto.MassRocket;
import com.api.dto.PayloadWeights;
import com.api.dto.SecondStage;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class SxRocket {

    @JsonProperty("_id")
    private String _id;

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("active")
    private Boolean active;

    @JsonProperty("stages")
    private Integer stages;

    @JsonProperty("boosters")
    private Integer boosters;

    @JsonProperty("cost_per_launch")
    private Integer costPerLaunch;

    @JsonProperty("success_rate_pct")
    private Integer successRatePct;

    @JsonProperty("first_flight")
    private String firstFlight;

    @JsonProperty("country")
    private String country;

    @JsonProperty("company")
    private String company;

    @JsonProperty("height")
    private SxDimensionRocket height;

    @JsonProperty("diameter")
    private SxDimensionRocket diameter;

    @JsonProperty("mass")
    private SxMassRocket mass;

    @JsonProperty("payload_weights")
    private List<SxPayloadWeights> payloadWeights;

    @JsonProperty("first_stage")
    private SxFirstStage firstStage;

    @JsonProperty("second_stage")
    private SxSecondStage secondStage;

    @JsonProperty("engines")
    private SxEngines engines;

    @JsonProperty("landing_legs")
    private SxLandingLegs landingLegs;

    @JsonProperty("flickr_images")
    private List<String> flickrImages;

    @JsonProperty("wikipedia")
    private String wikipedia;

    @JsonProperty("description")
    private String description;

    @JsonProperty("rocket_id")
    private String rocketId;

    @JsonProperty("rocket_name")
    private String rocketName;

    @JsonProperty("rocket_type")
    private String rocketType;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

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

    public SxDimensionRocket getHeight() {
        return height;
    }

    public void setHeight(SxDimensionRocket height) {
        this.height = height;
    }

    public SxDimensionRocket getDiameter() {
        return diameter;
    }

    public void setDiameter(SxDimensionRocket diameter) {
        this.diameter = diameter;
    }

    public SxMassRocket getMass() {
        return mass;
    }

    public void setMass(SxMassRocket mass) {
        this.mass = mass;
    }

    public List<SxPayloadWeights> getPayloadWeights() {
        return payloadWeights;
    }

    public void setPayloadWeights(List<SxPayloadWeights> payloadWeights) {
        this.payloadWeights = payloadWeights;
    }

    public SxFirstStage getFirstStage() {
        return firstStage;
    }

    public void setFirstStage(SxFirstStage firstStage) {
        this.firstStage = firstStage;
    }

    public SxSecondStage getSecondStage() {
        return secondStage;
    }

    public void setSecondStage(SxSecondStage secondStage) {
        this.secondStage = secondStage;
    }

    public SxEngines getEngines() {
        return engines;
    }

    public void setEngines(SxEngines engines) {
        this.engines = engines;
    }

    public SxLandingLegs getLandingLegs() {
        return landingLegs;
    }

    public void setLandingLegs(SxLandingLegs landingLegs) {
        this.landingLegs = landingLegs;
    }

    public List<String> getFlickrImages() {
        return flickrImages;
    }

    public void setFlickrImages(List<String> flickrImages) {
        this.flickrImages = flickrImages;
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
