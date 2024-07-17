package com.api.entity;

import com.api.dto.CompositeFairing;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SxPayloads {
    @JsonProperty("option_1")
    private String option1;

    @JsonProperty("composite_fairing")
    private SxCompositeFairing compositeFairing;
}
