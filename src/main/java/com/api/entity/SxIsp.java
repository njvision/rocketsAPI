package com.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class SxIsp {
    @JsonProperty("sea_level")
    private Integer seaLevel;

    @JsonProperty("vacuum")
    private Integer vacuum;

    public Integer getSeaLevel() {
        return seaLevel;
    }

    public void setSeaLevel(Integer seaLevel) {
        this.seaLevel = seaLevel;
    }

    public Integer getVacuum() {
        return vacuum;
    }

    public void setVacuum(Integer vacuum) {
        this.vacuum = vacuum;
    }
}
