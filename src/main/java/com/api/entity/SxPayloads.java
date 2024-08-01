package com.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SxPayloads {
    @JsonProperty("option_1")
    private String option1;

    @JsonProperty("composite_fairing")
    private SxCompositeFairing compositeFairing;
}
