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
public class IspDto {

    @JsonProperty("sea_level")
    private Integer seaLevel;

    @JsonProperty("vacuum")
    private Integer vacuum;
}
