package com.api.mapper;

import com.api.dto.CompositeFairing;
import com.api.dto.DimensionRocket;
import com.api.dto.Engines;
import com.api.dto.FirstStage;
import com.api.dto.FlickrImages;
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
import com.api.entity.SxFlickrImages;
import com.api.entity.SxIsp;
import com.api.entity.SxLandingLegs;
import com.api.entity.SxMassRocket;
import com.api.entity.SxPayloadWeights;
import com.api.entity.SxPayloads;
import com.api.entity.SxRocket;
import com.api.entity.SxSecondStage;
import com.api.entity.SxThrustStage;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface RocketMapper {
    RocketDto toDto(SxRocket sxRocket);

    SxRocket toDto(RocketDto sxRocket);

    RocketMongoIdDto toDtoRocketMongoId(SxRocket sxRocketMongoId);

    SxRocket toDtoRocketMongoId(RocketMongoIdDto sxRocketMongoId);

    DimensionRocket toDto(SxDimensionRocket dimensionRocket);

    SxDimensionRocket toDto(DimensionRocket dimensionRocket);

    MassRocket toDto(SxMassRocket massRocket);

    SxMassRocket toDto(MassRocket massRocket);

    PayloadWeights toDto(SxPayloadWeights payloadWeights);

    SxPayloadWeights toDto(PayloadWeights payloadWeights);

    FirstStage toDto(SxFirstStage firstStage);

    SxFirstStage toDto(FirstStage firstStage);

    SecondStage toDto(SxSecondStage secondStage);

    SxSecondStage toDto(SecondStage secondStage);

    Engines toDto(SxEngines engines);

    SxEngines toDto(Engines engines);

    LandingLegs toDto(SxLandingLegs landingLegs);

    SxLandingLegs toDto(LandingLegs landingLegs);

    Isp toDto(SxIsp isp);

    SxIsp toDto(Isp isp);

    ThrustStage toDto(SxThrustStage thrustEngines);

    SxThrustStage toDto(ThrustStage thrustEngines);

    Payloads toDto(SxPayloads payloads);

    SxPayloads toDto(Payloads payloads);

    CompositeFairing toDto(SxCompositeFairing compositeFairing);

    SxCompositeFairing toDto(CompositeFairing compositeFairing);

    FlickrImages toDto(SxFlickrImages flickrImages);

    SxFlickrImages toDto(FlickrImages flickrImages);
}
