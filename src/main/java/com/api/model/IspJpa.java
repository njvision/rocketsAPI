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
@Table(name="isp")
public class IspJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "sea_level")
    private Integer seaLevel;

    @Column(name = "vacuum")
    private Integer vacuum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSeaLevel() {
        return seaLevel;
    }

    public void setSeaLevel(Integer seaLevel) {
        this.seaLevel = seaLevel;
    }

    public Integer getVacuum() {
        return vacuum;
    }

    public void setVacuum(Integer vacuum) {
        this.vacuum = vacuum;
    }
}
