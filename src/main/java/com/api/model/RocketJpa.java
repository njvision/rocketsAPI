package com.api.model;

import com.api.validation.PreviousMonthData;
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
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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

    @Column(name = "active")
    private Boolean active;

    @Min(0)
    @Max(1000000000)
    @Column(name = "stages")
    private Integer stages;

    @Min(0)
    @Max(1000000000)
    @Column(name = "boosters")
    private Integer boosters;

    @Min(0)
    @Max(1000000000)
    @Column(name = "cost_per_launch")
    private Integer costPerLaunch;

    @Min(0)
    @Max(100)
    @Column(name = "success_rate_pct")
    private Integer successRatePct;

//    @PreviousMonthData(days = 600)
    @Column(name = "first_flight")
    private String firstFlight;

    @Size(max = 10000)
    @Column(name = "country")
    private String country;

    @Pattern(regexp = "^[a-zA-Z0-9]*$")
    @Size(max = 10000)
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

    @Size(max = 10000)
    @Column(name = "wikipedia", columnDefinition = "TEXT")
    private String wikipedia;

    @Size(max = 10000)
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Pattern(regexp = "^[a-zA-Z0-9]*$")
    @Size(max = 10000)
    @Column(name = "rocket_id")
    private String rocketId;

    @Size(max = 10000)
    @Column(name = "rocket_name")
    private String rocketName;

    @Pattern(regexp = "^[a-zA-Z0-9]*$")
    @Size(max = 10000)
    @Column(name = "rocket_type")
    private String rocketType;
}
