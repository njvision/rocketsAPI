package com.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CompositeFairingDto {

    @JsonProperty("height")
    private DimensionRocketDto height;

    @JsonProperty("diameter")
    private DimensionRocketDto diameter;
}
