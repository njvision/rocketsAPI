package com.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Rocket_DTO {

    @NotEmpty
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
    @Past(message = "Date must be in the past")
    protected String first_flight;

    
    protected String country;
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
    protected String wikipedia;
    protected String description;
    protected String rocket_id;
    protected String rocket_name;
    protected String rocket_type;

    @Data
    public static class DimensionRocket {
        private double meters;
        private double feet;
    }

    @Data
    public static class MassRocket {
        private long kg;
        private long lb;
    }

    @Data
    public static class PayloadWeights {
        private String id;
        private String name;
        private int kg;
        private int lb;
    }

    @Data
    public static class FirstStage {
        private boolean reusable;
        private int engines;
        private double fuel_amount_tons;
        private int burn_time_sec;
        private ThrustFirstStage thrust_sea_level;
        private ThrustFirstStage thrust_vacuum;

        @Data
        public static class ThrustFirstStage {
            private int kn;
            private long lbf;
        }
    }

    @Data
    public static class SecondStage {
        private boolean reusable;
        private int engines;
        private double fuel_amount_tons;
        private int burn_time_sec;
        private ThrustSecondStage thrust;
        private Payloads payloads;

        @Data
        public static class ThrustSecondStage {
            private int kn;
            private long lbf;
        }

        @Data
        public static class Payloads {
            private String option_1;
            private CompositeFairing composite_fairing;

            @Data
            public static class CompositeFairing {
                private DimensionCompositeFairing height;
                private DimensionCompositeFairing diameter;

                @Data
                public static class DimensionCompositeFairing {
                    private double meters;
                    private double feet;
                }
            }
        }
    }

    @Data
    public static class Engines {
        private int number;
        private String type;
        private String version;
        private String layout;
        private Isp isp;
        private int engine_loss_max;
        private String propellant_1;
        private String propellant_2;
        private ThrustEngines thrust_sea_level;
        private ThrustEngines thrust_vacuum;
        private int thrust_to_weight;

        @Data
        public static class Isp {
            private int sea_level;
            private int vacuum;
        }

        @Data
        public static class ThrustEngines {
            private int kn;
            private long lbf;
        }
    }

    @Data
    public static class LandingLegs {
        private int number;
        private String material;
    }
}
