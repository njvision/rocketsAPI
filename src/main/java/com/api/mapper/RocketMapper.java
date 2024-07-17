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
    RocketDto toDtoRocket(SxRocket sxRocket);

    RocketMongoIdDto toDtoRocketMongoId(SxRocket sxRocketMongoId);

    DimensionRocket toDtoDimensionRocket(SxDimensionRocket dimensionRocket);

    MassRocket toDtoMassRocket(SxMassRocket massRocket);

    PayloadWeights toDtoPayloadWeights(SxPayloadWeights payloadWeights);

    FirstStage toDtoFirstStage(SxFirstStage firstStage);

    SecondStage toDtoSecondStage(SxSecondStage secondStage);

    Engines toDtoEngines(SxEngines engines);

    LandingLegs toDtoLandingLegs(SxLandingLegs landingLegs);

    Isp toDtoIsp(SxIsp isp);

    ThrustStage toDtoThrustEngines(SxThrustStage thrustEngines);

    ThrustStage toDtoThrustFirstStage(SxThrustStage thrustFirstStage);

    ThrustStage toDtoThrustSecondStage(SxThrustStage thrustSecondStage);

    Payloads toDtoPayloads(SxPayloads payloads);

    CompositeFairing toDtoCompositeFairing(SxCompositeFairing compositeFairing);

    DimensionRocket toDtoDimensionCompositeFairing(SxDimensionRocket dimensionCompositeFairing);
}
