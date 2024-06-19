package com.api.mapper;

import com.api.dto.RocketDto;
import com.api.dto.RocketMongoIdDto;
import com.api.entity.SX_Rocket;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface RocketMapper {
    @Mapping(source = "cost_per_launch", target = "cost_per_launch")
    @Mapping(source = "success_rate_pct", target = "success_rate_pct")
    @Mapping(source = "first_flight", target = "first_flight")
    @Mapping(source = "payload_weights", target = "payload_weights")
    @Mapping(source = "first_stage", target = "first_stage")
    @Mapping(source = "second_stage", target = "second_stage")
    @Mapping(source = "landing_legs", target = "landing_legs")
    @Mapping(source = "flickr_images", target = "flickr_images")
    @Mapping(source = "rocket_id", target = "rocket_id")
    @Mapping(source = "rocket_name", target = "rocket_name")
    @Mapping(source = "rocket_type", target = "rocket_type")
    RocketDto toDtoRocket(SX_Rocket sxRocket);

    @Mapping(source = "_id", target = "_id")
    RocketMongoIdDto toDtoRocketMongoId(SX_Rocket sxRocketMongoId);

    @Mapping(source = "meters", target = "meters")
    @Mapping(source = "feet", target = "feet")
    RocketDto.DimensionRocket toDtoDimensionRocket(SX_Rocket.DimensionRocket dimensionRocket);

    @Mapping(source = "kg", target = "kg")
    @Mapping(source = "lb", target = "lb")
    RocketDto.MassRocket toDtoMassRocket(SX_Rocket.MassRocket massRocket);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "kg", target = "kg")
    @Mapping(source = "lb", target = "lb")
    RocketDto.PayloadWeights toDtoPayloadWeights(SX_Rocket.PayloadWeights payloadWeights);

    @Mapping(source = "reusable", target = "reusable")
    @Mapping(source = "engines", target = "engines")
    @Mapping(source = "fuel_amount_tons", target = "fuel_amount_tons")
    @Mapping(source = "burn_time_sec", target = "burn_time_sec")
    @Mapping(source = "thrust_sea_level", target = "thrust_sea_level")
    @Mapping(source = "thrust_vacuum", target = "thrust_vacuum")
    RocketDto.FirstStage toDtoFirstStage(SX_Rocket.FirstStage firstStage);

    @Mapping(source = "reusable", target = "reusable")
    @Mapping(source = "engines", target = "engines")
    @Mapping(source = "fuel_amount_tons", target = "fuel_amount_tons")
    @Mapping(source = "burn_time_sec", target = "burn_time_sec")
    @Mapping(source = "thrust", target = "thrust")
    @Mapping(source = "payloads", target = "payloads")
    RocketDto.SecondStage toDtoSecondStage(SX_Rocket.SecondStage secondStage);

    @Mapping(source = "number", target = "number")
    @Mapping(source = "type", target = "type")
    @Mapping(source = "version", target = "version")
    @Mapping(source = "layout", target = "layout")
    @Mapping(source = "isp", target = "isp")
    @Mapping(source = "engine_loss_max", target = "engine_loss_max")
    @Mapping(source = "propellant_1", target = "propellant_1")
    @Mapping(source = "propellant_2", target = "propellant_2")
    @Mapping(source = "thrust_sea_level", target = "thrust_sea_level")
    @Mapping(source = "thrust_vacuum", target = "thrust_vacuum")
    @Mapping(source = "thrust_to_weight", target = "thrust_to_weight")
    RocketDto.Engines toDtoEngines(SX_Rocket.Engines engines);

    @Mapping(source = "number", target = "number")
    @Mapping(source = "material", target = "material")
    RocketDto.LandingLegs toDtoLandingLegs(SX_Rocket.LandingLegs landingLegs);

    @Mapping(source = "sea_level", target = "sea_level")
    @Mapping(source = "vacuum", target = "vacuum")
    RocketDto.Engines.Isp toDtoIsp(SX_Rocket.Engines.Isp isp);

    @Mapping(source = "kn", target = "kn")
    @Mapping(source = "lbf", target = "lbf")
    RocketDto.Engines.ThrustEngines toDtoThrustEngines(SX_Rocket.Engines.ThrustEngines thrustEngines);

    @Mapping(source = "kn", target = "kn")
    @Mapping(source = "lbf", target = "lbf")
    RocketDto.FirstStage.ThrustFirstStage toDtoThrustFirstStage(SX_Rocket.FirstStage.ThrustFirstStage thrustFirstStage);

    @Mapping(source = "kn", target = "kn")
    @Mapping(source = "lbf", target = "lbf")
    RocketDto.SecondStage.ThrustSecondStage toDtoThrustSecondStage(SX_Rocket.SecondStage.ThrustSecondStage thrustSecondStage);

    @Mapping(source = "option_1", target = "option_1")
    @Mapping(source = "composite_fairing", target = "composite_fairing")
    RocketDto.SecondStage.Payloads toDtoPayloads(SX_Rocket.SecondStage.Payloads payloads);

    @Mapping(source = "height", target = "height")
    @Mapping(source = "diameter", target = "diameter")
    RocketDto.SecondStage.Payloads.CompositeFairing toDtoCompositeFairing(SX_Rocket.SecondStage.Payloads.CompositeFairing compositeFairing);

    @Mapping(source = "meters", target = "meters")
    @Mapping(source = "feet", target = "feet")
    RocketDto.SecondStage.Payloads.CompositeFairing.DimensionCompositeFairing toDtoDimensionCompositeFairing(SX_Rocket.SecondStage.Payloads.CompositeFairing.DimensionCompositeFairing dimensionCompositeFairing);
}
