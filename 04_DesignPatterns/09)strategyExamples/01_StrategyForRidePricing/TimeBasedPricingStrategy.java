package com.assignment.question;


//step-2: Create concrete strategies classes. Make it singleton
public class TimeBasedPricingStrategy implements PricingStrategy {
    private static final double PER_MINUTE_RATE = 0.5; // Rate per minute
    private static TimeBasedPricingStrategy instance; 

     /*Due to reason explained in DistanceBasedPRicingStrategy, not implementing singelton.
     
    //making constructor private.
    private DistanceBasedPricingStrategy() {

    }
    */

    public static TimeBasedPricingStrategy getInstance() {
        if(instance == null) {
            synchronized(TimeBasedPricingStrategy.class) {
                if(instance == null) {
                    instance = new TimeBasedPricingStrategy();
                }
            }
        }
        return instance;
    }

    public PricingType supportsType(){
        return PricingType.TIME_BASED;
    }

    public Double calculateRidePrice(RideDetails rideDetails){
        return (PricingStrategy.BASE_FARE + rideDetails.getDuration()*PER_MINUTE_RATE);
    }
}
