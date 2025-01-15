package com.assignment.question;

//step-5: In the client code, use the simple factory DP to get the instance of PricingStrategy
public class PricingManager {
    private PricingStrategy strategy;
    //test case was failing, so I am adding pricing type also. But it was not needed
    private PricingType type;

    // Changed due to implementing Strategy DP
    // private static final double BASE_FARE = 5.0; // Base fare amount
    // private static final double PER_KILOMETER_RATE = 2.0; // Rate per kilometer
    // private static final double PER_MINUTE_RATE = 0.5; // Rate per minute
    // private static final double SURGE_MULTIPLIER = 2.0; // Surge pricing multiplier

    // private PricingType pricingType;
    
    

    //Idealy, I dont need PricingStrategy parameter as from the PricingType parameter, I can get PricingStrategy object. 
    //But test cases were failing, which means test needed constructor to have both parameters
    //so I am adding PricingStraegy paramerter also.
    public PricingManager(PricingType pricingType, PricingStrategy strategy){
        this.strategy = PriceStrategyFactory.getStrategy(pricingType);
        
        // Changed due to implementing Strategy DP
        // this.pricingType = pricingType;
        
    }


    public Double calculatePrice(RideDetails rideDetails) {
        return this.strategy.calculateRidePrice(rideDetails);
        
        // Changed due to implementing Strategy DP
        // switch (pricingType) {
        //     case DISTANCE_BASED:
        //         return BASE_FARE + PER_KILOMETER_RATE * rideDetails.getDistance();
        //     case TIME_BASED:
        //         return BASE_FARE + PER_MINUTE_RATE * rideDetails.getDuration();
        //     case SURGE:
        //         return BASE_FARE * SURGE_MULTIPLIER;
        // }
        // throw new IllegalArgumentException("Invalid pricing type");
        
    }

}