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
    private Integer seaLevel;

    @JsonProperty("vacuum")
    private Integer vacuum;
}
