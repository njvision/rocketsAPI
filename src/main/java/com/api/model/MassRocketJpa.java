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
@Table(name="mass_rocket")
public class MassRocketJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

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
