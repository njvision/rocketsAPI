package com.api.entity;

import com.api.dto.DimensionRocket;
import com.api.dto.Engines;
import com.api.dto.FirstStage;
import com.api.dto.LandingLegs;
import com.api.dto.MassRocket;
import com.api.dto.PayloadWeights;
import com.api.dto.SecondStage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SxRocket {

    public String _id;
    public int id;
    public Boolean active;
    public int stages;
    public int boosters;
    public long cost_per_launch;
    public int success_rate_pct;
    public String first_flight;
    public String country;
    public String company;
    public DimensionRocket height;
    public DimensionRocket diameter;
    public MassRocket mass;
    public List<PayloadWeights> payload_weights;
    public FirstStage first_stage;
    public SecondStage second_stage;
    public Engines engines;
    public LandingLegs landing_legs;
    public List<String> flickr_images;
    public String wikipedia;
    public String description;
    public String rocket_id;
    public String rocket_name;
    public String rocket_type;
}
