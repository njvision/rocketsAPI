package com.api.entity;

import com.api.dto.DimensionRocket;
import com.fasterxml.jackson.annotation.JsonProperty;
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
@Getter
@Entity
@Table(name="sx_composite_fairing")
public class SxCompositeFairing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "height_id")
    @JsonProperty("height")
    private SxDimensionRocket height;

    @ManyToOne
    @JoinColumn(name = "diameter_id")
    @JsonProperty("diameter")
    private SxDimensionRocket diameter;
}
