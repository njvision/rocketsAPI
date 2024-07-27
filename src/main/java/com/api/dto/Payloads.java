package com.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Payloads {

    @JsonProperty("option_1")
    private String option1;

    @JsonProperty("composite_fairing")
    private CompositeFairing compositeFairing;

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public CompositeFairing getCompositeFairing() {
        return compositeFairing;
    }

    public void setCompositeFairing(CompositeFairing compositeFairing) {
        this.compositeFairing = compositeFairing;
    }
}
