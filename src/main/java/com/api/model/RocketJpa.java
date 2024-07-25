package com.api.model;

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
@Table(name = "sx_rocket")
public class RocketJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public String _id;

    private Boolean active;

    private Integer stages;

    private Integer boosters;

    private Integer costPerLaunch;

    private Integer successRatePct;

    private String firstFlight;

    private String country;

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

    private String wikipedia;

    private String description;

    private String rocketId;

    private String rocketName;

    private String rocketType;
}
