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
public class DimensionRocketDto {

    @JsonProperty("meters")
    private Double meters;

    @JsonProperty("feet")
    private Double feet;
}
