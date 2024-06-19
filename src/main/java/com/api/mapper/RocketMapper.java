package com.api.mapper;

import com.api.dto.Rocket_DTO;
import com.api.entity.SX_Rocket;

public class RocketMapper {

    public static SX_Rocket toEntity(Rocket_DTO dto) {
        SX_Rocket entity = new SX_Rocket();
        entity.setId(dto.getId());
        entity.setActive(dto.getActive());
        entity.setStages(dto.getStages());
        entity.setBoosters(dto.getBoosters());
        entity.setCostPerLaunch(dto.getCost_per_launch());
        entity.setSuccessRatePct(dto.getSuccess_rate_pct());
        entity.setFirstFlight(dto.getFirst_flight());
        entity.setCountry(dto.getCountry());
        entity.setCompany(dto.getCompany());
        entity.setHeight(toDimensionRocket(dto.getHeight()));
        entity.setDiameter(toDimensionRocket(dto.getDiameter()));
        entity.setMass(toMassRocket(dto.getMass()));
        entity.setPayloadWeights(dto.getPayload_weights().stream().map(RocketMapper::toPayloadWeights).toList());
        entity.setFirstStage(toFirstStage(dto.getFirst_stage()));
        entity.setSecondStage(toSecondStage(dto.getSecond_stage()));
        entity.setEngines(toEngines(dto.getEngines()));
        entity.setLandingLegs(toLandingLegs(dto.getLanding_legs()));
        entity.setFlickrImages(dto.getFlickr_images());
        entity.setWikipedia(dto.getWikipedia());
        entity.setDescription(dto.getDescription());
        entity.setRocketId(dto.getRocket_id());
        entity.setRocketName(dto.getRocket_name());
        entity.setRocketType(dto.getRocket_type());
        return entity;
    }

    public static Rocket_DTO toDTO(SX_Rocket entity) {
        return new Rocket_DTO(
                entity.getId(),
                entity.getActive(),
                entity.getStages(),
                entity.getBoosters(),
                entity.getCostPerLaunch(),
                entity.getSuccessRatePct(),
                entity.getFirstFlight(),
                entity.getCountry(),
                entity.getCompany(),
                toDimensionRocketDTO(entity.getHeight()),
                toDimensionRocketDTO(entity.getDiameter()),
                toMassRocketDTO(entity.getMass()),
                entity.getPayloadWeights().stream().map(RocketMapper::toPayloadWeightsDTO).toList(),
                toFirstStageDTO(entity.getFirstStage()),
                toSecondStageDTO(entity.getSecondStage()),
                toEnginesDTO(entity.getEngines()),
                toLandingLegsDTO(entity.getLandingLegs()),
                entity.getFlickrImages(),
                entity.getWikipedia(),
                entity.getDescription(),
                entity.getRocketId(),
                entity.getRocketName(),
                entity.getRocketType()
        );
    }

    private static SX_Rocket.DimensionRocket toDimensionRocket(Rocket_DTO.DimensionRocket dto) {
        if (dto == null) return null;
        SX_Rocket.DimensionRocket entity = new SX_Rocket.DimensionRocket();
        entity.setMeters(dto.getMeters());
        entity.setFeet(dto.getFeet());
        return entity;
    }

    private static Rocket_DTO.DimensionRocket toDimensionRocketDTO(SX_Rocket.DimensionRocket entity) {
        if (entity == null) return null;
        return new Rocket_DTO.DimensionRocket(entity.getMeters(), entity.getFeet());
    }

    private static SX_Rocket.MassRocket toMassRocket(Rocket_DTO.MassRocket dto) {
        if (dto == null) return null;
        SX_Rocket.MassRocket entity = new SX_Rocket.MassRocket();
        entity.setKg(dto.getKg());
        entity.setLb(dto.getLb());
        return entity;
    }

    private static Rocket_DTO.MassRocket toMassRocketDTO(SX_Rocket.MassRocket entity) {
        if (entity == null) return null;
        return new Rocket_DTO.MassRocket(entity.getKg(), entity.getLb());
    }

    private static SX_Rocket.PayloadWeights toPayloadWeights(Rocket_DTO.PayloadWeights dto) {
        if (dto == null) return null;
        SX_Rocket.PayloadWeights entity = new SX_Rocket.PayloadWeights();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setKg(dto.getKg());
        entity.setLb(dto.getLb());
        return entity;
    }

    private static Rocket_DTO.PayloadWeights toPayloadWeightsDTO(SX_Rocket.PayloadWeights entity) {
        if (entity == null) return null;
        return new Rocket_DTO.PayloadWeights(entity.getId(), entity.getName(), entity.getKg(), entity.getLb());
    }

    private static SX_Rocket.FirstStage toFirstStage(Rocket_DTO.FirstStage dto) {
        if (dto == null) return null;
        SX_Rocket.FirstStage entity = new SX_Rocket.FirstStage();
        entity.setReusable(dto.getReusable());
        entity.setEngines(dto.getEngines());
        entity.setFuelAmountTons(dto.getFuel_amount_tons());
        entity.setBurnTimeSec(dto.getBurn_time_sec());
        entity.setThrustSeaLevel(toThrustFirstStage(dto.getThrust_sea_level()));
        entity.setThrustVacuum(toThrustFirstStage(dto.getThrust_vacuum()));
        return entity;
    }

    private static Rocket_DTO.FirstStage toFirstStageDTO(SX_Rocket.FirstStage entity) {
        if (entity == null) return null;
        return new Rocket_DTO.FirstStage(
                entity.getReusable(),
                entity.getEngines(),
                entity.getFuelAmountTons(),
                entity.getBurnTimeSec(),
                toThrustFirstStageDTO(entity.getThrustSeaLevel()),
                toThrustFirstStageDTO(entity.getThrustVacuum())
        );
    }

    private static SX_Rocket.FirstStage.ThrustFirstStage toThrustFirstStage(Rocket_DTO.FirstStage.ThrustFirstStage dto) {
        if (dto == null) return null;
        SX_Rocket.FirstStage.ThrustFirstStage entity = new SX_Rocket.FirstStage.ThrustFirstStage();
        entity.setKn(dto.getKn());
        entity.setLbf(dto.getLbf());
        return entity;
    }

    private static Rocket_DTO.FirstStage.ThrustFirstStage toThrustFirstStageDTO(SX_Rocket.FirstStage.ThrustFirstStage entity) {
        if (entity == null) return null;
        return new Rocket_DTO.FirstStage.ThrustFirstStage(entity.getKn(), entity.getLbf());
    }

    private static SX_Rocket.SecondStage toSecondStage(Rocket_DTO.SecondStage dto) {
        if (dto == null) return null;
        SX_Rocket.SecondStage entity = new SX_Rocket.SecondStage();
        entity.setReusable(dto.getReusable());
        entity.setEngines(dto.getEngines());
        entity.setFuelAmountTons(dto.getFuel_amount_tons());
        entity.setBurnTimeSec(dto.getBurn_time_sec());
        entity.setThrust(toThrustSecondStage(dto.getThrust()));
        entity.setPayloads(toPayloads(dto.getPayloads()));
        return entity;
    }

    private static Rocket_DTO.SecondStage toSecondStageDTO(SX_Rocket.SecondStage entity) {
        if (entity == null) return null;
        return new Rocket_DTO.SecondStage(
                entity.getReusable(),
                entity.getEngines(),
                entity.getFuelAmountTons(),
                entity.getBurnTimeSec(),
                toThrustSecondStageDTO(entity.getThrust()),
                toPayloadsDTO(entity.getPayloads())
        );
    }

    private static SX_Rocket.SecondStage.ThrustSecondStage toThrustSecondStage(Rocket_DTO.SecondStage.ThrustSecondStage dto) {
        if (dto == null) return null;
        SX_Rocket.SecondStage.ThrustSecondStage entity = new SX_Rocket.SecondStage.ThrustSecondStage();
        entity.setKn(dto.getKn());
        entity.setLbf(dto.getLbf());
        return entity;
    }

    private static Rocket_DTO.SecondStage.ThrustSecondStage toThrustSecondStageDTO(SX_Rocket.SecondStage.ThrustSecondStage entity) {
        if (entity == null) return null;
        return new Rocket_DTO.SecondStage.ThrustSecondStage(entity.getKn(), entity.getLbf());
    }

    private static SX_Rocket.SecondStage.Payloads toPayloads(Rocket_DTO.SecondStage.Payloads dto) {
        if (dto == null) return null;
        SX_Rocket.SecondStage.Payloads entity = new SX_Rocket.SecondStage.Payloads();
        entity.setOption1(dto.getOption_1());
        entity.setCompositeFairing(toCompositeFairing(dto.getComposite_fairing()));
        return entity;
    }

    private static Rocket_DTO.SecondStage.Payloads toPayloadsDTO(SX_Rocket.SecondStage.Payloads entity) {
        if (entity == null) return null;
        return new Rocket_DTO.SecondStage.Payloads(
                entity.getOption1(),
                toCompositeFairingDTO(entity.getCompositeFairing())
        );
    }

    private static SX_Rocket.SecondStage.Payloads.CompositeFairing toCompositeFairing(Rocket_DTO.SecondStage.Payloads.CompositeFairing dto) {
        if (dto == null) return null;
        SX_Rocket.SecondStage.Payloads.CompositeFairing entity = new SX_Rocket.SecondStage.Payloads.CompositeFairing();
        entity.setHeight(toDimensionCompositeFairing(dto.getHeight()));
        entity.setDiameter(toDimensionCompositeFairing(dto.getDiameter()));
        return entity;
    }

    private static Rocket_DTO.SecondStage.Payloads.CompositeFairing toCompositeFairingDTO(SX_Rocket.SecondStage.Payloads.CompositeFairing entity) {
        if (entity == null) return null;
        return new Rocket_DTO.SecondStage.Payloads.CompositeFairing(
                toDimensionCompositeFairingDTO(entity.getHeight()),
                toDimensionCompositeFairingDTO(entity.getDiameter())
        );
    }

    private static SX_Rocket.SecondStage.Payloads.CompositeFairing.DimensionCompositeFairing toDimensionCompositeFairing(Rocket_DTO.SecondStage.Payloads.CompositeFairing.DimensionCompositeFairing dto) {
        if (dto == null) return null;
        SX_Rocket.SecondStage.Payloads.CompositeFairing.DimensionCompositeFairing entity = new SX_Rocket.SecondStage.Payloads.CompositeFairing.DimensionCompositeFairing();
        entity.setMeters(dto.getMeters());
        entity.setFeet(dto.getFeet());
        return entity;
    }

    private static Rocket_DTO.SecondStage.Payloads.CompositeFairing.DimensionCompositeFairing toDimensionCompositeFairingDTO(SX_Rocket.SecondStage.Payloads.CompositeFairing.DimensionCompositeFairing entity) {
        if (entity == null) return null;
        return new Rocket_DTO.SecondStage.Payloads.CompositeFairing.DimensionCompositeFairing(entity.getMeters(), entity.getFeet());
    }

    private static SX_Rocket.Engines toEngines(Rocket_DTO.Engines dto) {
        if (dto == null) return null;
        SX_Rocket.Engines entity = new SX_Rocket.Engines();
        entity.setNumber(dto.getNumber());
        entity.setType(dto.getType());
        entity.setVersion(dto.getVersion());
        entity.setLayout(dto.getLayout());
        entity.setIsp(toIsp(dto.getIsp()));
        entity.setEngineLossMax(dto.getEngine_loss_max());
        entity.setPropellant1(dto.getPropellant_1());
        entity.setPropellant2(dto.getPropellant_2());
        entity.setThrustSeaLevel(toThrustEngines(dto.getThrust_sea_level()));
        entity.setThrustVacuum(toThrustEngines(dto.getThrust_vacuum()));
        entity.setThrustToWeight(dto.getThrust_to_weight());
        return entity;
    }

    private static Rocket_DTO.Engines toEnginesDTO(SX_Rocket.Engines entity) {
        if (entity == null) return null;
        return new Rocket_DTO.Engines(
                entity.getNumber(),
                entity.getType(),
                entity.getVersion(),
                entity.getLayout(),
                toIspDTO(entity.getIsp()),
                entity.getEngineLossMax(),
                entity.getPropellant1(),
                entity.getPropellant2(),
                toThrustEnginesDTO(entity.getThrustSeaLevel()),
                toThrustEnginesDTO(entity.getThrustVacuum()),
                entity.getThrustToWeight()
        );
    }

    private static SX_Rocket.Engines.Isp toIsp(Rocket_DTO.Engines.Isp dto) {
        if (dto == null) return null;
        SX_Rocket.Engines.Isp entity = new SX_Rocket.Engines.Isp();
        entity.setSeaLevel(dto.getSea_level());
        entity.setVacuum(dto.getVacuum());
        return entity;
    }

    private static Rocket_DTO.Engines.Isp toIspDTO(SX_Rocket.Engines.Isp entity) {
        if (entity == null) return null;
        return new Rocket_DTO.Engines.Isp(entity.getSeaLevel(), entity.getVacuum());
    }

    private static SX_Rocket.Engines.ThrustEngines toThrustEngines(Rocket_DTO.Engines.ThrustEngines dto) {
        if (dto == null) return null;
        SX_Rocket.Engines.ThrustEngines entity = new SX_Rocket.Engines.ThrustEngines();
        entity.setKn(dto.getKn());
        entity.setLbf(dto.getLbf());
        return entity;
    }

    private static Rocket_DTO.Engines.ThrustEngines toThrustEnginesDTO(SX_Rocket.Engines.ThrustEngines entity) {
        if (entity == null) return null;
        return new Rocket_DTO.Engines.ThrustEngines(entity.getKn(), entity.getLbf());
    }

    private static SX_Rocket.LandingLegs toLandingLegs(Rocket_DTO.LandingLegs dto) {
        if (dto == null) return null;
        SX_Rocket.LandingLegs entity = new SX_Rocket.LandingLegs();
        entity.setNumber(dto.getNumber());
        entity.setMaterial(dto.getMaterial());
        return entity;
    }

    private static Rocket_DTO.LandingLegs toLandingLegsDTO(SX_Rocket.LandingLegs entity) {
        if (entity == null) return null;
        return new Rocket_DTO.LandingLegs(entity.getNumber(), entity.getMaterial());
    }
}
