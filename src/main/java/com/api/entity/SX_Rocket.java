package com.api.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SX_Rocket {

    protected int id;
    protected Boolean active;
    protected int stages;
    protected int boosters;
    protected long costPerLaunch;
    protected int successRatePct;
    protected String firstFlight;
    protected String country;
    protected String company;
    protected DimensionRocket height;
    protected DimensionRocket diameter;
    protected MassRocket mass;
    protected List<PayloadWeights> payloadWeights;
    protected FirstStage firstStage;
    protected SecondStage secondStage;
    protected Engines engines;
    protected LandingLegs landingLegs;
    protected List<String> flickrImages;
    protected String wikipedia;
    protected String description;
    protected String rocketId;
    protected String rocketName;
    protected String rocketType;

    @Getter
    @Setter
    public static class DimensionRocket {
        private double meters;
        private double feet;
    }

    @Getter
    @Setter
    public static class MassRocket {
        private long kg;
        private long lb;
    }

    @Getter
    @Setter
    public static class PayloadWeights {
        private String id;
        private String name;
        private long kg;
        private long lb;
    }

    @Getter
    @Setter
    public static class FirstStage {
        private Boolean reusable;
        private int engines;
        private double fuelAmountTons;
        private long burnTimeSec;
        private ThrustFirstStage thrustSeaLevel;
        private ThrustFirstStage thrustVacuum;

        @Getter
        @Setter
        public static class ThrustFirstStage {
            private int kn;
            private long lbf;
        }
    }

    @Getter
    @Setter
    public static class SecondStage {
        private Boolean reusable;
        private int engines;
        private double fuelAmountTons;
        private int burnTimeSec;
        private ThrustSecondStage thrust;
        private Payloads payloads;

        @Getter
        @Setter
        public static class ThrustSecondStage {
            private int kn;
            private long lbf;
        }

        @Getter
        @Setter
        public static class Payloads {
            private String option1;
            private CompositeFairing compositeFairing;

            @Getter
            @Setter
            public static class CompositeFairing {
                private DimensionCompositeFairing height;
                private DimensionCompositeFairing diameter;

                @Getter
                @Setter
                public static class DimensionCompositeFairing {
                    private double meters;
                    private double feet;
                }
            }
        }
    }

    @Getter
    @Setter
    public static class Engines {
        private int number;
        private String type;
        private String version;
        private String layout;
        private Isp isp;
        private int engineLossMax;
        private String propellant1;
        private String propellant2;
        private ThrustEngines thrustSeaLevel;
        private ThrustEngines thrustVacuum;
        private int thrustToWeight;

        @Getter
        @Setter
        public static class Isp {
            private int seaLevel;
            private int vacuum;
        }

        @Getter
        @Setter
        public static class ThrustEngines {
            private int kn;
            private long lbf;
        }
    }

    @Getter
    @Setter
    public static class LandingLegs {
        private int number;
        private String material;
    }
}
