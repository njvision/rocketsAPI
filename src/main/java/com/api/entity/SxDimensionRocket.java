package com.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SxDimensionRocket {
    @JsonProperty("meters")
    private Double meters;

    @JsonProperty("feet")
    private Double feet;
}
