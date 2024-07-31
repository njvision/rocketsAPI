package com.api.mapper;

import com.api.dto.CompositeFairingDto;
import com.api.dto.DimensionRocketDto;
import com.api.dto.EnginesDto;
import com.api.dto.FirstStageDto;
import com.api.dto.FlickrImagesDto;
import com.api.dto.IspDto;
import com.api.dto.LandingLegsDto;
import com.api.dto.MassRocketDto;
import com.api.dto.PayloadWeightsDto;
import com.api.dto.PayloadsDto;
import com.api.dto.RocketDto;
import com.api.dto.RocketMongoIdDto;
import com.api.dto.SecondStageDto;
import com.api.dto.ThrustStageDto;
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

@Mapper(componentModel = "spring")
public interface RocketMapper {
    RocketDto toDto(SxRocket sxRocket);

    RocketMongoIdDto toDtoRocketMongoId(SxRocket sxRocketMongoId);

    DimensionRocketDto toDto(SxDimensionRocket dimensionRocket);

    MassRocketDto toDto(SxMassRocket massRocket);

    PayloadWeightsDto toDto(SxPayloadWeights payloadWeights);

    FirstStageDto toDto(SxFirstStage firstStage);

    SecondStageDto toDto(SxSecondStage secondStage);

    EnginesDto toDto(SxEngines engines);

    LandingLegsDto toDto(SxLandingLegs landingLegs);

    IspDto toDto(SxIsp isp);

    ThrustStageDto toDto(SxThrustStage thrustEngines);

    PayloadsDto toDto(SxPayloads payloads);

    CompositeFairingDto toDto(SxCompositeFairing compositeFairing);

    FlickrImagesDto toDto(SxFlickrImages flickrImages);
}
