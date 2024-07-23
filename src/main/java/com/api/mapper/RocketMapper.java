package com.api.mapper;

import com.api.dto.CompositeFairing;
import com.api.dto.DimensionRocket;
import com.api.dto.Engines;
import com.api.dto.FirstStage;
import com.api.dto.Isp;
import com.api.dto.LandingLegs;
import com.api.dto.MassRocket;
import com.api.dto.PayloadWeights;
import com.api.dto.Payloads;
import com.api.dto.RocketDto;
import com.api.dto.RocketMongoIdDto;
import com.api.dto.SecondStage;
import com.api.dto.ThrustStage;
import com.api.entity.SxCompositeFairing;
import com.api.entity.SxDimensionRocket;
import com.api.entity.SxEngines;
import com.api.entity.SxFirstStage;
import com.api.entity.SxIsp;
import com.api.entity.SxLandingLegs;
import com.api.entity.SxMassRocket;
import com.api.entity.SxPayloadWeights;
import com.api.entity.SxPayloads;
import com.api.entity.SxRocket;
import com.api.entity.SxSecondStage;
import com.api.entity.SxThrustStage;
import org.mapstruct.Mapper;

@Mapper
public interface RocketMapper {
    RocketDto toDto(SxRocket sxRocket);

    RocketMongoIdDto toDtoRocketMongoId(SxRocket sxRocketMongoId);

    DimensionRocket toDto(SxDimensionRocket dimensionRocket);

    MassRocket toDto(SxMassRocket massRocket);

    PayloadWeights toDto(SxPayloadWeights payloadWeights);

    FirstStage toDto(SxFirstStage firstStage);

    SecondStage toDto(SxSecondStage secondStage);

    Engines toDto(SxEngines engines);

    LandingLegs toDto(SxLandingLegs landingLegs);

    Isp toDto(SxIsp isp);

    ThrustStage toDto(SxThrustStage thrustEngines);

    Payloads toDto(SxPayloads payloads);

    CompositeFairing toDto(SxCompositeFairing compositeFairing);
}
