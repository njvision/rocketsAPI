package com.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Payloads {

    @JsonProperty("option_1")
    private String option1;

    @JsonProperty("composite_fairing")
    private CompositeFairing compositeFairing;
}
