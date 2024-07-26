package com.api.model;

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
@Data
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

    @ManyToOne
    @JoinColumn(name = "height_id")
    private DimensionRocketJpa height;

    @ManyToOne
    @JoinColumn(name = "diameter_id")
    private DimensionRocketJpa diameter;

    @ManyToOne
    @JoinColumn(name = "mass_id")
    private MassRocketJpa mass;

    @ManyToOne
    @JoinColumn(name = "first_stage_id")
    private FirstStageJpa firstStage;

    @ManyToOne
    @JoinColumn(name = "second_stage_id")
    private SecondStageJpa secondStage;

    @ManyToOne
    @JoinColumn(name = "engines_id")
    private EnginesJpa engines;

    @ManyToOne
    @JoinColumn(name = "landing_legs_id")
    private LandingLegsJpa landingLegs;

    @Column(name = "wikipedia")
    private String wikipedia;

    @Column(name = "description")
    private String description;

    @Column(name = "rocket_id")
    private String rocketId;

    @Column(name = "rocket_name")
    private String rocketName;

    @Column(name = "rocket_type")
    private String rocketType;
}
