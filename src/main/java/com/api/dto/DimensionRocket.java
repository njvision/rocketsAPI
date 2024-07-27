package com.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class DimensionRocket {

    @JsonProperty("meters")
    private Double meters;

    @JsonProperty("feet")
    private Double feet;

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
