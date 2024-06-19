package com.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RocketDto {

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

    @Getter
    @Setter
    public static class DimensionRocket {
        public double meters;
        public double feet;
    }

    @Getter
    @Setter
    public static class MassRocket {
        public long kg;
        public long lb;
    }

    @Getter
    @Setter
    public static class PayloadWeights {
        public String id;
        public String name;
        public long kg;
        public long lb;
    }

    @Getter
    @Setter
    public static class FirstStage {
        public Boolean reusable;
        public int engines;
        public double fuel_amount_tons;
        public long burn_time_sec;
        public ThrustFirstStage thrust_sea_level;
        public ThrustFirstStage thrust_vacuum;

        @Getter
        @Setter
        public static class ThrustFirstStage {
            public int kn;
            public long lbf;
        }
    }

    @Getter
    @Setter
    public static class SecondStage {
        public Boolean reusable;
        public int engines;
        public double fuel_amount_tons;
        public int burn_time_sec;
        public ThrustSecondStage thrust;
        public Payloads payloads;

        @Getter
        @Setter
        public static class ThrustSecondStage {
            public int kn;
            public long lbf;
        }

        @Getter
        @Setter
        public static class Payloads {
            public String option_1;
            public CompositeFairing composite_fairing;

            @Getter
            @Setter
            public static class CompositeFairing {
                public DimensionCompositeFairing height;
                public DimensionCompositeFairing diameter;

                @Getter
                @Setter
                public static class DimensionCompositeFairing {
                    public double meters;
                    public double feet;
                }
            }
        }
    }

    @Getter
    @Setter
    public static class Engines {
        public int number;
        public String type;
        public String version;
        public String layout;
        public Isp isp;
        public int engine_loss_max;
        public String propellant_1;
        public String propellant_2;
        public ThrustEngines thrust_sea_level;
        public ThrustEngines thrust_vacuum;
        public int thrust_to_weight;

        @Getter
        @Setter
        public static class Isp {
            public int sea_level;
            public int vacuum;
        }

        @Getter
        @Setter
        public static class ThrustEngines {
            public int kn;
            public long lbf;
        }
    }

    @Getter
    @Setter
    public static class LandingLegs {
        public int number;
        public String material;
    }
}
