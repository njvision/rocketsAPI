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
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "payload_weights")
public class PayloadWeightsJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Pattern(regexp = "^[a-zA-Z0-9]*$")
    @Size(max = 10000)
    @Column(name = "payload_id")
    private String payloadId;

    @Pattern(regexp = "^[a-zA-Z0-9]*$")
    @Size(max = 10000)
    @Column(name = "name")
    private String name;

    @Min(0)
    @Max(1000000000)
    @Column(name = "kg")
    private Integer kg;

    @Min(0)
    @Max(1000000000)
    @Column(name = "lb")
    private Integer lb;

    @ManyToOne
    @JoinColumn(name = "rocket_id")
    private RocketJpa rocket;
}
