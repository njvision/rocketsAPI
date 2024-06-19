package com.api.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SX_RocketMongoId extends SX_Rocket {
    private String _id;

    public SX_RocketMongoId(String mongoId, SX_Rocket rocketDTO) {
        super(rocketDTO.getId(), rocketDTO.getActive(), rocketDTO.getStages(), rocketDTO.getBoosters(),
                rocketDTO.getCostPerLaunch(), rocketDTO.getSuccessRatePct(), rocketDTO.getFirstFlight(),
                rocketDTO.getCountry(), rocketDTO.getCompany(), rocketDTO.getHeight(), rocketDTO.getDiameter(),
                rocketDTO.getMass(), rocketDTO.getPayloadWeights(), rocketDTO.getFirstStage(),
                rocketDTO.getSecondStage(), rocketDTO.getEngines(), rocketDTO.getLandingLegs(),
                rocketDTO.getFlickrImages(), rocketDTO.getWikipedia(), rocketDTO.getDescription(),
                rocketDTO.getRocketId(), rocketDTO.getRocketName(), rocketDTO.getRocketType());
        this._id = mongoId;
    }
}
