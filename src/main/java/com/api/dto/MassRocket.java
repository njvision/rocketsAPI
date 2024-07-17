package com.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class MassRocket {

    @JsonProperty("kg")
    private long kg;

    @JsonProperty("lb")
    private long lb;
}
