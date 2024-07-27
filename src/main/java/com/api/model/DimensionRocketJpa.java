package com.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="dimension_rocket")
public class DimensionRocketJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "meters")
    private Double meters;

    @Column(name = "feet")
    private Double feet;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getMeters() {
        return meters;
    }

    public void setMeters(Double meters) {
        this.meters = meters;
    }

    public Double getFeet() {
        return feet;
    }

    public void setFeet(Double feet) {
        this.feet = feet;
    }
}
