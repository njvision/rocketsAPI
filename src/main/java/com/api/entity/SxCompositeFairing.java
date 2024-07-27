package com.api.entity;

import com.api.dto.DimensionRocket;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class SxCompositeFairing {
    @JsonProperty("height")
    private SxDimensionRocket height;

    @JsonProperty("diameter")
    private SxDimensionRocket diameter;

    public SxDimensionRocket getHeight() {
        return height;
    }

    public void setHeight(SxDimensionRocket height) {
        this.height = height;
    }

    public SxDimensionRocket getDiameter() {
        return diameter;
    }

    public void setDiameter(SxDimensionRocket diameter) {
        this.diameter = diameter;
    }
}
