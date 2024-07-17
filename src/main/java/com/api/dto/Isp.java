package com.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Isp {

    @JsonProperty("sea_level")
    private int seaLevel;

    @JsonProperty("vacuum")
    private int vacuum;
}
