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
    //    @Mapping(source = "cost_per_launch", target = "cost_per_launch")
//    @Mapping(source = "success_rate_pct", target = "success_rate_pct")
//    @Mapping(source = "first_flight", target = "first_flight")
//    @Mapping(source = "payload_weights", target = "payload_weights")
//    @Mapping(source = "first_stage", target = "first_stage")
//    @Mapping(source = "second_stage", target = "second_stage")
//    @Mapping(source = "landing_legs", target = "landing_legs")
//    @Mapping(source = "flickr_images", target = "flickr_images")
//    @Mapping(source = "rocket_id", target = "rocket_id")
//    @Mapping(source = "rocket_name", target = "rocket_name")
//    @Mapping(source = "rocket_type", target = "rocket_type")
    RocketDto toDtoRocket(SxRocket sxRocket);

    //    @Mapping(source = "_id", target = "_id")
    RocketMongoIdDto toDtoRocketMongoId(SxRocket sxRocketMongoId);

    //    @Mapping(source = "meters", target = "meters")
//    @Mapping(source = "feet", target = "feet")
//    RocketDto.DimensionRocket toDtoDimensionRocket(SxRocket.DimensionRocket dimensionRocket);
    DimensionRocket toDtoDimensionRocket(SxDimensionRocket dimensionRocket);

    //    @Mapping(source = "kg", target = "kg")
//    @Mapping(source = "lb", target = "lb")
//    RocketDto.MassRocket toDtoMassRocket(SxRocket.MassRocket massRocket);
    MassRocket toDtoMassRocket(SxMassRocket massRocket);

    //    @Mapping(source = "id", target = "id")
//    @Mapping(source = "name", target = "name")
//    @Mapping(source = "kg", target = "kg")
//    @Mapping(source = "lb", target = "lb")
//    RocketDto.PayloadWeights toDtoPayloadWeights(SxRocket.PayloadWeights payloadWeights);
    PayloadWeights toDtoPayloadWeights(SxPayloadWeights payloadWeights);

    //    @Mapping(source = "reusable", target = "reusable")
//    @Mapping(source = "engines", target = "engines")
//    @Mapping(source = "fuel_amount_tons", target = "fuel_amount_tons")
//    @Mapping(source = "burn_time_sec", target = "burn_time_sec")
//    @Mapping(source = "thrust_sea_level", target = "thrust_sea_level")
//    @Mapping(source = "thrust_vacuum", target = "thrust_vacuum")
//    RocketDto.FirstStage toDtoFirstStage(SxRocket.FirstStage firstStage);
    FirstStage toDtoFirstStage(SxFirstStage firstStage);

    //    @Mapping(source = "reusable", target = "reusable")
//    @Mapping(source = "engines", target = "engines")
//    @Mapping(source = "fuel_amount_tons", target = "fuel_amount_tons")
//    @Mapping(source = "burn_time_sec", target = "burn_time_sec")
//    @Mapping(source = "thrust", target = "thrust")
//    @Mapping(source = "payloads", target = "payloads")
//    RocketDto.SecondStage toDtoSecondStage(SxRocket.SecondStage secondStage);
    SecondStage toDtoSecondStage(SxSecondStage secondStage);

    //    @Mapping(source = "number", target = "number")
//    @Mapping(source = "type", target = "type")
//    @Mapping(source = "version", target = "version")
//    @Mapping(source = "layout", target = "layout")
//    @Mapping(source = "isp", target = "isp")
//    @Mapping(source = "engine_loss_max", target = "engine_loss_max")
//    @Mapping(source = "propellant_1", target = "propellant_1")
//    @Mapping(source = "propellant_2", target = "propellant_2")
//    @Mapping(source = "thrust_sea_level", target = "thrust_sea_level")
//    @Mapping(source = "thrust_vacuum", target = "thrust_vacuum")
//    @Mapping(source = "thrust_to_weight", target = "thrust_to_weight")
//    RocketDto.Engines toDtoEngines(SxRocket.Engines engines);
    Engines toDtoEngines(SxEngines engines);

    //    @Mapping(source = "number", target = "number")
//    @Mapping(source = "material", target = "material")
//    RocketDto.LandingLegs toDtoLandingLegs(SxRocket.LandingLegs landingLegs);
    LandingLegs toDtoLandingLegs(SxLandingLegs landingLegs);

    //    @Mapping(source = "sea_level", target = "sea_level")
//    @Mapping(source = "vacuum", target = "vacuum")
//    RocketDto.Engines.Isp toDtoIsp(SxRocket.Engines.Isp isp);
    Isp toDtoIsp(SxIsp isp);

    //    @Mapping(source = "kn", target = "kn")
//    @Mapping(source = "lbf", target = "lbf")
//    RocketDto.Engines.ThrustEngines toDtoThrustEngines(SxRocket.Engines.ThrustEngines thrustEngines);
    ThrustStage toDtoThrustEngines(SxThrustStage thrustEngines);

    //    @Mapping(source = "kn", target = "kn")
//    @Mapping(source = "lbf", target = "lbf")
//    RocketDto.FirstStage.ThrustStage toDtoThrustFirstStage(SxRocket.FirstStage.ThrustStage thrustFirstStage);
    ThrustStage toDtoThrustFirstStage(SxThrustStage thrustFirstStage);

    //    @Mapping(source = "kn", target = "kn")
//    @Mapping(source = "lbf", target = "lbf")
//    RocketDto.SecondStage.ThrustSecondStage toDtoThrustSecondStage(SxRocket.SecondStage.ThrustSecondStage thrustSecondStage);
    ThrustStage toDtoThrustSecondStage(SxThrustStage thrustSecondStage);

    //    @Mapping(source = "option_1", target = "option_1")
//    @Mapping(source = "composite_fairing", target = "composite_fairing")
//    RocketDto.SecondStage.Payloads toDtoPayloads(SxRocket.SecondStage.Payloads payloads);
    Payloads toDtoPayloads(SxPayloads payloads);

    //    @Mapping(source = "height", target = "height")
//    @Mapping(source = "diameter", target = "diameter")
//    RocketDto.SecondStage.Payloads.CompositeFairing toDtoCompositeFairing(SxRocket.SecondStage.Payloads.CompositeFairing compositeFairing);
    CompositeFairing toDtoCompositeFairing(SxCompositeFairing compositeFairing);

    //    @Mapping(source = "meters", target = "meters")
//    @Mapping(source = "feet", target = "feet")
//    RocketDto.SecondStage.Payloads.CompositeFairing.DimensionCompositeFairing toDtoDimensionCompositeFairing(SxRocket.SecondStage.Payloads.CompositeFairing.DimensionCompositeFairing dimensionCompositeFairing);
    DimensionRocket toDtoDimensionCompositeFairing(SxDimensionRocket dimensionCompositeFairing);
}
