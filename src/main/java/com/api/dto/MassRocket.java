package com.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class MassRocket {

    @JsonProperty("kg")
    private Integer kg;

    @JsonProperty("lb")
    private Integer lb;

    public Integer getLb() {
        return lb;
    }

    public void setLb(Integer lb) {
        this.lb = lb;
    }

    public Integer getKg() {
        return kg;
    }

    public void setKg(Integer kg) {
        this.kg = kg;
    }
}
