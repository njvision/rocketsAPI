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
public class MassRocketDto {

    @JsonProperty("kg")
    private Integer kg;

    @JsonProperty("lb")
    private Integer lb;
}
