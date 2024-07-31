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
import com.api.dto.SecondStageDto;
import com.api.dto.ThrustStageDto;
import com.api.model.CompositeFairingJpa;
import com.api.model.DimensionRocketJpa;
import com.api.model.EnginesJpa;
import com.api.model.FirstStageJpa;
import com.api.model.FlickrImagesJpa;
import com.api.model.IspJpa;
import com.api.model.LandingLegsJpa;
import com.api.model.MassRocketJpa;
import com.api.model.PayloadWeightsJpa;
import com.api.model.PayloadsJpa;
import com.api.model.RocketJpa;
import com.api.model.SecondStageJpa;
import com.api.model.ThrustStageJpa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface JPARocketMapper {

    RocketDto toDto(RocketJpa sxRocket);

    RocketJpa toDto(RocketDto sxRocket);

    DimensionRocketDto toDto(DimensionRocketJpa dimensionRocket);

    DimensionRocketJpa toDto(DimensionRocketDto dimensionRocket);

    MassRocketDto toDto(MassRocketJpa massRocket);

    MassRocketJpa toDto(MassRocketDto massRocket);

    PayloadWeightsDto toDto(PayloadWeightsJpa payloadWeights);

    PayloadWeightsJpa toDto(PayloadWeightsDto payloadWeights);

    FirstStageDto toDto(FirstStageJpa firstStage);

    FirstStageJpa toDto(FirstStageDto firstStage);

    SecondStageDto toDto(SecondStageJpa secondStage);

    SecondStageJpa toDto(SecondStageDto secondStage);

    EnginesDto toDto(EnginesJpa engines);

    EnginesJpa toDto(EnginesDto engines);

    LandingLegsDto toDto(LandingLegsJpa landingLegs);

    LandingLegsJpa toDto(LandingLegsDto landingLegs);

    IspDto toDto(IspJpa isp);

    IspJpa toDto(IspDto isp);

    ThrustStageDto toDto(ThrustStageJpa thrustEngines);

    ThrustStageJpa toDto(ThrustStageDto thrustEngines);

    PayloadsDto toDto(PayloadsJpa payloads);

    PayloadsJpa toDto(PayloadsDto payloads);

    CompositeFairingDto toDto(CompositeFairingJpa compositeFairing);

    CompositeFairingJpa toDto(CompositeFairingDto compositeFairing);

    FlickrImagesDto toDto(FlickrImagesJpa flickrImages);

    FlickrImagesJpa toDto(FlickrImagesDto flickrImages);
}
