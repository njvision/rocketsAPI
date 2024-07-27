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
@Table(name="composite_fairing")
public class CompositeFairingJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "height_id")
    private DimensionRocketJpa height;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "diameter_id")
    private DimensionRocketJpa diameter;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DimensionRocketJpa getHeight() {
        return height;
    }

    public void setHeight(DimensionRocketJpa height) {
        this.height = height;
    }

    public DimensionRocketJpa getDiameter() {
        return diameter;
    }

    public void setDiameter(DimensionRocketJpa diameter) {
        this.diameter = diameter;
    }
}
