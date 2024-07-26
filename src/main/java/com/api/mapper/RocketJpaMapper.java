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
public interface RocketJpaMapper {
    RocketJpa toDto(SxRocket sxRocket);

    SxRocket toDto(RocketJpa sxRocket);

    DimensionRocketJpa toDto(SxDimensionRocket dimensionRocket);

    SxDimensionRocket toDto(DimensionRocketJpa dimensionRocket);

    MassRocketJpa toDto(SxMassRocket massRocket);

    SxMassRocket toDto(MassRocketJpa massRocket);

    PayloadWeightsJpa toDto(SxPayloadWeights payloadWeights);

    SxPayloadWeights toDto(PayloadWeightsJpa payloadWeights);

    FirstStageJpa toDto(SxFirstStage firstStage);

    SxFirstStage toDto(FirstStageJpa firstStage);

    SecondStageJpa toDto(SxSecondStage secondStage);

    SxSecondStage toDto(SecondStageJpa secondStage);

    EnginesJpa toDto(SxEngines engines);

    SxEngines toDto(EnginesJpa engines);

    LandingLegsJpa toDto(SxLandingLegs landingLegs);

    SxLandingLegs toDto(LandingLegsJpa landingLegs);

    IspJpa toDto(SxIsp isp);

    SxIsp toDto(IspJpa isp);

    ThrustStageJpa toDto(SxThrustStage thrustEngines);

    SxThrustStage toDto(ThrustStageJpa thrustEngines);

    PayloadsJpa toDto(SxPayloads payloads);

    SxPayloads toDto(PayloadsJpa payloads);

    CompositeFairingJpa toDto(SxCompositeFairing compositeFairing);

    SxCompositeFairing toDto(CompositeFairingJpa compositeFairing);

    FlickrImagesJpa toDto(SxFlickrImages flickrImages);

    SxFlickrImages toDto(FlickrImagesJpa flickrImages);
}
