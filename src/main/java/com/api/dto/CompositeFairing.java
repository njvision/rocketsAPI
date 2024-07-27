package com.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class CompositeFairing {

    @JsonProperty("height")
    private DimensionRocket height;

    @JsonProperty("diameter")
    private DimensionRocket diameter;

    public DimensionRocket getHeight() {
        return height;
    }

    public void setHeight(DimensionRocket height) {
        this.height = height;
    }

    public DimensionRocket getDiameter() {
        return diameter;
    }

    public void setDiameter(DimensionRocket diameter) {
        this.diameter = diameter;
    }
}
