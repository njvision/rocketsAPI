package com.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Pattern;

@EqualsAndHashCode(callSuper = true)
@Data
public class RocketMongoId_DTO extends Rocket_DTO {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Id must be alphanumeric or spaces")
    private String _id;

    public RocketMongoId_DTO(String mongoId, Rocket_DTO rocketDTO) {
        super(rocketDTO.getId(), rocketDTO.getActive(), rocketDTO.getStages(), rocketDTO.getBoosters(),
                rocketDTO.getCost_per_launch(), rocketDTO.getSuccess_rate_pct(), rocketDTO.getFirst_flight(),
                rocketDTO.getCountry(), rocketDTO.getCompany(), rocketDTO.getHeight(), rocketDTO.getDiameter(),
                rocketDTO.getMass(), rocketDTO.getPayload_weights(), rocketDTO.getFirst_stage(),
                rocketDTO.getSecond_stage(), rocketDTO.getEngines(), rocketDTO.getLanding_legs(),
                rocketDTO.getFlickr_images(), rocketDTO.getWikipedia(), rocketDTO.getDescription(),
                rocketDTO.getRocket_id(), rocketDTO.getRocket_name(), rocketDTO.getRocket_type());
        this._id = mongoId;
    }
}
