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
public class ThrustStage {

    @JsonProperty("kN")
    private Integer kn;

    @JsonProperty("lbf")
    private Integer lbf;
}
