package com.assignment.question;


//step-2: Create concrete strategies classes. Make it singleton
public class SurgePricingStrategy implements PricingStrategy {
    private static final double SURGE_MULTIPLIER = 2.0; // Surge pricing multiplier
    private static SurgePricingStrategy instance; 

    /*Due to reason explained in DistanceBasedPRicingStrategy, not implementing singelton.
     
    //making constructor private.
    private DistanceBasedPricingStrategy() {

    }
    */

    public static SurgePricingStrategy getInstance() {
        if(instance == null) {
            synchronized(SurgePricingStrategy.class) {
                if(instance == null) {
                    instance = new SurgePricingStrategy();
                }
            }
        }
        return instance;
    }

    public PricingType supportsType(){
        return PricingType.SURGE;
    }

    public Double calculateRidePrice(RideDetails rideDetails){
        return (PricingStrategy.BASE_FARE * SURGE_MULTIPLIER);
    }
}
