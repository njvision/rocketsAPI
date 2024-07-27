package com.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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
@Table(name = "payloads")
public class PayloadsJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "option_1")
    private String option1;

    @Column(name = "option_2")
    private String option2;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "composite_fairing_id")
    private CompositeFairingJpa compositeFairing;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public CompositeFairingJpa getCompositeFairing() {
        return compositeFairing;
    }

    public void setCompositeFairing(CompositeFairingJpa compositeFairing) {
        this.compositeFairing = compositeFairing;
    }
}
