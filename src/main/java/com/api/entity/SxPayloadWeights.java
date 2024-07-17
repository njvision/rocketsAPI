package com.api.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SxPayloadWeights {
    private String id;
    private String name;
    private long kg;
    private long lb;
}
