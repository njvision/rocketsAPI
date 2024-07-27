package com.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class ThrustStage {

    @JsonProperty("kN")
    private Integer kn;

    @JsonProperty("lbf")
    private Integer lbf;

    public Integer getKn() {
        return kn;
    }

    public void setKn(Integer kn) {
        this.kn = kn;
    }

    public Integer getLbf() {
        return lbf;
    }

    public void setLbf(Integer lbf) {
        this.lbf = lbf;
    }
}
