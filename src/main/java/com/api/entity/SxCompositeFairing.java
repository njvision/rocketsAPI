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
public class SxCompositeFairing {
    @JsonProperty("height")
    private SxDimensionRocket height;

    @JsonProperty("diameter")
    private SxDimensionRocket diameter;
}
