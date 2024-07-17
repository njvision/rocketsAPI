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
    private int kn;

    @JsonProperty("lbf")
    private long lbf;
}
