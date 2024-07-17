package com.api.entity;

import com.api.dto.DimensionRocket;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SxCompositeFairing {
    private SxDimensionRocket height;
    private SxDimensionRocket diameter;
}
