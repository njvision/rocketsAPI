package com.api.entity;

import com.api.dto.CompositeFairing;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SxPayloads {
    private String option_1;
    private SxCompositeFairing composite_fairing;
}
