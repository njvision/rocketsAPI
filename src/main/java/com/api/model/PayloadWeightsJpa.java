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
@Table(name = "payload_weights")
public class PayloadWeightsJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rocket_id")
    private RocketJpa rocket;

    @Column(name = "payload_id")
    private String payloadId;

    @Column(name = "name")
    private String name;

    @Column(name = "kg")
    private Integer kg;

    @Column(name = "lb")
    private Integer lb;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RocketJpa getRocket() {
        return rocket;
    }

    public void setRocket(RocketJpa rocket) {
        this.rocket = rocket;
    }

    public String getPayloadId() {
        return payloadId;
    }

    public void setPayloadId(String payloadId) {
        this.payloadId = payloadId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getKg() {
        return kg;
    }

    public void setKg(Integer kg) {
        this.kg = kg;
    }

    public Integer getLb() {
        return lb;
    }

    public void setLb(Integer lb) {
        this.lb = lb;
    }
}
