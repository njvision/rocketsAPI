package com.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ThrustStage {

    @JsonProperty("kn")
    private int kn;

    @JsonProperty("lbf")
    private long lbf;
}
