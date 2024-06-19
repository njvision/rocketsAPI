package com.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
public class Rocket_DTO {

    @NotNull
    @Min(1)
    protected int id;

    @NotNull
    protected Boolean active;

    @NotNull
    @Min(1)
    protected int stages;

    @NotNull
    @Min(1)
    protected int boosters;

    @NotNull
    @Min(1)
    @Max(1000000)
    protected long cost_per_launch;

    @NotNull
    @Min(1)
    protected int success_rate_pct;

    @NotNull
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Date must be in the format YYYY-MM-DD")
    protected String first_flight;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Country must be alphanumeric or spaces")
    protected String country;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Company must be alphanumeric or spaces")
    protected String company;
    protected DimensionRocket height;
    protected DimensionRocket diameter;
    protected MassRocket mass;
    protected List<PayloadWeights> payload_weights;
    protected FirstStage first_stage;
    protected SecondStage second_stage;
    protected Engines engines;
    protected LandingLegs landing_legs;
    protected List<String> flickr_images;
    @NotNull
    @Pattern(regexp = "https://en\\.wikipedia\\.org/", message = "Should be a link from wikipedia")
    protected String wikipedia;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Description must be alphanumeric or spaces")
    protected String description;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Rocket id must be alphanumeric or spaces")
    @Size(min = 2, max = 50)
    protected String rocket_id;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Rocket id must be alphanumeric or spaces")
    @Size(min = 2, max = 50)
    protected String rocket_name;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Rocket id must be alphanumeric or spaces")
    @Size(min = 2, max = 50)
    protected String rocket_type;

    @Data
    @AllArgsConstructor
    public static class DimensionRocket {
        @DecimalMin(value = "0.01")
        private double meters;
        @DecimalMin(value = "0.01")
        private double feet;
    }

    @Data
    @AllArgsConstructor
    public static class MassRocket {
        @Min(1)
        private long kg;
        @Min(1)
        private long lb;
    }

    @Data
    @AllArgsConstructor
    public static class PayloadWeights {
        @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Id must be alphanumeric or spaces")
        @Size(min = 2, max = 50)
        private String id;
        @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Name must be alphanumeric or spaces")
        @Size(min = 2, max = 50)
        private String name;
        @Min(1)
        private long kg;
        @Min(1)
        private long lb;
    }

    @Data
    @AllArgsConstructor
    public static class FirstStage {
        @NotEmpty
        private Boolean reusable;
        @Min(1)
        private int engines;
        @DecimalMin(value = "0.01")
        private double fuel_amount_tons;
        @Min(1)
        private long burn_time_sec;
        private ThrustFirstStage thrust_sea_level;
        private ThrustFirstStage thrust_vacuum;

        @Data
        @AllArgsConstructor
        public static class ThrustFirstStage {
            @Min(1)
            private int kn;
            @Max(100000)
            private long lbf;
        }
    }

    @Data
    @AllArgsConstructor
    public static class SecondStage {
        @NotEmpty
        private Boolean reusable;
        @Min(1)
        private int engines;
        @DecimalMin(value = "0.01")
        private double fuel_amount_tons;
        @Min(1)
        private int burn_time_sec;
        private ThrustSecondStage thrust;
        private Payloads payloads;

        @Data
        @AllArgsConstructor
        public static class ThrustSecondStage {
            @Min(1)
            private int kn;
            @Min(1)
            private long lbf;
        }

        @Data
        @AllArgsConstructor
        public static class Payloads {
            @Size(min=1, max=50)
            private String option_1;
            private CompositeFairing composite_fairing;

            @Data
            @AllArgsConstructor
            public static class CompositeFairing {
                private DimensionCompositeFairing height;
                private DimensionCompositeFairing diameter;

                @Data
                @AllArgsConstructor
                public static class DimensionCompositeFairing {
                    @DecimalMin(value = "0.01")
                    private double meters;
                    @DecimalMin(value = "0.01")
                    private double feet;
                }
            }
        }
    }

    @Data
    @AllArgsConstructor
    public static class Engines {
        @Min(1)
        private int number;
        @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Type must be alphanumeric or spaces")
        @Size(min = 2, max = 50)
        private String type;
        @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Type must be alphanumeric or spaces")
        @Size(min = 2, max = 50)
        private String version;
        @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Type must be alphanumeric or spaces")
        @Size(min = 2, max = 50)
        private String layout;
        private Isp isp;
        @Min(1)
        private int engine_loss_max;
        @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Type must be alphanumeric or spaces")
        @Size(min = 2, max = 50)
        private String propellant_1;
        @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Type must be alphanumeric or spaces")
        @Size(min = 2, max = 50)
        private String propellant_2;
        private ThrustEngines thrust_sea_level;
        private ThrustEngines thrust_vacuum;
        @Min(1)
        @Max(500)
        private int thrust_to_weight;

        @Data
        @AllArgsConstructor
        public static class Isp {
            @Min(1)
            private int sea_level;
            @Min(1)
            private int vacuum;
        }

        @Data
        @AllArgsConstructor
        public static class ThrustEngines {
            @Min(1)
            private int kn;
            @Min(1)
            private long lbf;
        }
    }

    @Data
    @AllArgsConstructor
    public static class LandingLegs {
        @Min(1)
        private int number;
        @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Material must be alphanumeric or spaces")
        private String material;
    }
}
