package com.api.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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

    @OneToMany(mappedBy = "rocket", cascade = CascadeType.ALL)
    private List<PayloadWeightsJpa> payloadWeights;

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

    @ElementCollection
    @CollectionTable(name = "flickr_images", joinColumns = @JoinColumn(name = "rocket_id"))
    @Column(name = "url")
    private List<String> flickrImages;

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
}
