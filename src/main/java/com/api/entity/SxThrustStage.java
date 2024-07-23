package com.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SxThrustStage {
    @JsonProperty("kn")
    private Integer kn;

    @JsonProperty("lbf")
    private Integer lbf;
}
