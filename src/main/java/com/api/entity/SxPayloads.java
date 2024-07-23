package com.api.entity;

import com.api.dto.CompositeFairing;
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
@Table(name = "sx_payloads")
public class SxPayloads {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonProperty("option_1")
    private String option1;

    @JsonProperty("option_2")
    private String option2;

    @ManyToOne
    @JoinColumn(name = "composite_fairing_id")
    @JsonProperty("composite_fairing")
    private SxCompositeFairing compositeFairing;
}
