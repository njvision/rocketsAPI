package com.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class SxPayloadWeights {
    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("kg")
    private Integer kg;

    @JsonProperty("lb")
    private Integer lb;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getKg() {
        return kg;
    }

    public void setKg(Integer kg) {
        this.kg = kg;
    }

    public Integer getLb() {
        return lb;
    }

    public void setLb(Integer lb) {
        this.lb = lb;
    }
}
