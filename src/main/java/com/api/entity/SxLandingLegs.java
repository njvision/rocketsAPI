package com.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SxLandingLegs {
    @JsonProperty("number")
    private Integer number;

    @JsonProperty("material")
    private String material;
}
