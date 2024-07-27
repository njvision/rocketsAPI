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
@Table(name="thrust_stage")
public class ThrustStageJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, updatable = false)
    private Integer id;

    @Column(name = "kn")
    private Integer kn;

    @Column(name = "lbf")
    private Integer lbf;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKn() {
        return kn;
    }

    public void setKn(Integer kn) {
        this.kn = kn;
    }

    public Integer getLbf() {
        return lbf;
    }

    public void setLbf(Integer lbf) {
        this.lbf = lbf;
    }
}
