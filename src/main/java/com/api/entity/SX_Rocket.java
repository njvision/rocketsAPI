package com.api.entity;

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
public class SX_Rocket {

    @NotNull
    @Size(min=5, max=50)
    public String _id;

    @NotNull
    @Min(1)
    public int id;

    @NotNull
    public Boolean active;

    @NotNull
    @Min(1)
    public int stages;

    @NotNull
    @Min(1)
    public int boosters;

    @NotNull
    @Min(1)
    @Max(1000000)
    public long cost_per_launch;

    @NotNull
    @Min(1)
    public int success_rate_pct;

    @NotNull
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Date must be in the format YYYY-MM-DD")
    public String first_flight;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Country must be alphanumeric or spaces")
    public String country;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Company must be alphanumeric or spaces")
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
    @NotNull
    @Pattern(regexp = "https://en\\.wikipedia\\.org/", message = "Should be a link from wikipedia")
    public String wikipedia;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Description must be alphanumeric or spaces")
    public String description;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Rocket id must be alphanumeric or spaces")
    @Size(min = 2, max = 50)
    public String rocket_id;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Rocket id must be alphanumeric or spaces")
    @Size(min = 2, max = 50)
    public String rocket_name;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Rocket id must be alphanumeric or spaces")
    @Size(min = 2, max = 50)
    public String rocket_type;

    @Data
    @AllArgsConstructor
    public static class DimensionRocket {
        @DecimalMin(value = "0.01")
        public double meters;
        @DecimalMin(value = "0.01")
        public double feet;
    }

    @Data
    @AllArgsConstructor
    public static class MassRocket {
        @Min(1)
        public long kg;
        @Min(1)
        public long lb;
    }

    @Data
    @AllArgsConstructor
    public static class PayloadWeights {
        @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Id must be alphanumeric or spaces")
        @Size(min = 2, max = 50)
        public String id;
        @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Name must be alphanumeric or spaces")
        @Size(min = 2, max = 50)
        public String name;
        @Min(1)
        public long kg;
        @Min(1)
        public long lb;
    }

    @Data
    @AllArgsConstructor
    public static class FirstStage {
        @NotEmpty
        public Boolean reusable;
        @Min(1)
        public int engines;
        @DecimalMin(value = "0.01")
        public double fuel_amount_tons;
        @Min(1)
        public long burn_time_sec;
        public ThrustFirstStage thrust_sea_level;
        public ThrustFirstStage thrust_vacuum;

        @Data
        @AllArgsConstructor
        public static class ThrustFirstStage {
            @Min(1)
            public int kn;
            @Max(100000)
            public long lbf;
        }
    }

    @Data
    @AllArgsConstructor
    public static class SecondStage {
        @NotEmpty
        public Boolean reusable;
        @Min(1)
        public int engines;
        @DecimalMin(value = "0.01")
        public double fuel_amount_tons;
        @Min(1)
        public int burn_time_sec;
        public ThrustSecondStage thrust;
        public Payloads payloads;

        @Data
        @AllArgsConstructor
        public static class ThrustSecondStage {
            @Min(1)
            public int kn;
            @Min(1)
            public long lbf;
        }

        @Data
        @AllArgsConstructor
        public static class Payloads {
            @Size(min = 1, max = 50)
            public String option_1;
            public CompositeFairing composite_fairing;

            @Data
            @AllArgsConstructor
            public static class CompositeFairing {
                public DimensionCompositeFairing height;
                public DimensionCompositeFairing diameter;

                @Data
                @AllArgsConstructor
                public static class DimensionCompositeFairing {
                    @DecimalMin(value = "0.01")
                    public double meters;
                    @DecimalMin(value = "0.01")
                    public double feet;
                }
            }
        }
    }

    @Data
    @AllArgsConstructor
    public static class Engines {
        @Min(1)
        public int number;
        @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Type must be alphanumeric or spaces")
        @Size(min = 2, max = 50)
        public String type;
        @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Type must be alphanumeric or spaces")
        @Size(min = 2, max = 50)
        public String version;
        @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Type must be alphanumeric or spaces")
        @Size(min = 2, max = 50)
        public String layout;
        public Isp isp;
        @Min(1)
        public int engine_loss_max;
        @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Type must be alphanumeric or spaces")
        @Size(min = 2, max = 50)
        public String propellant_1;
        @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Type must be alphanumeric or spaces")
        @Size(min = 2, max = 50)
        public String propellant_2;
        public ThrustEngines thrust_sea_level;
        public ThrustEngines thrust_vacuum;
        @Min(1)
        @Max(500)
        public int thrust_to_weight;

        @Data
        @AllArgsConstructor
        public static class Isp {
            @Min(1)
            public int sea_level;
            @Min(1)
            public int vacuum;
        }

        @Data
        @AllArgsConstructor
        public static class ThrustEngines {
            @Min(1)
            public int kn;
            @Min(1)
            public long lbf;
        }
    }

    @Data
    @AllArgsConstructor
    public static class LandingLegs {
        @Min(1)
        public int number;
        @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Material must be alphanumeric or spaces")
        public String material;
    }
}
