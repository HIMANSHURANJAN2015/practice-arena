package com.assignment.question;

import org.aspectj.lang.annotation.RequiredTypes;

//Step-3: create factory DP to choose straegy based on mode
public class PriceStrategyFactory {

    public static PricingStrategy getStrategy(PricingType type) {
        switch(type) {
            case DISTANCE_BASED: return DistanceBasedPricingStrategy.getInstance();
            case TIME_BASED: return TimeBasedPricingStrategy.getInstance();
            case SURGE: return SurgePricingStrategy.getInstance();
            default: throw new IllegalArgumentException("Wrong Pricing type"+type.toString());
        }
    }
}
