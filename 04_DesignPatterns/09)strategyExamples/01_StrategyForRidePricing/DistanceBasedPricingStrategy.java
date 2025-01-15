package com.assignment.question;

//step-2: Create concrete strategies classes. Make it singleton
public class DistanceBasedPricingStrategy implements PricingStrategy{
    private static final double PER_KILOMETER_RATE = 2.0; // Rate per kilometer
    private static DistanceBasedPricingStrategy instance; 

    /*Guess test cases didnt want singleton concrete strategy classes and 
     * wanted  to create it. So, not implementing singelton.
     
    //making constructor private.
    private DistanceBasedPricingStrategy() {

    }
    */

    public static DistanceBasedPricingStrategy getInstance() {
        if(instance == null) {
            synchronized(DistanceBasedPricingStrategy.class) {
                if(instance == null) {
                    instance = new DistanceBasedPricingStrategy();
                }
            }
        }
        return instance;
    }

    public PricingType supportsType(){
        return PricingType.DISTANCE_BASED;
    }

    public Double calculateRidePrice(RideDetails rideDetails){
        return (PricingStrategy.BASE_FARE + rideDetails.getDistance()*PER_KILOMETER_RATE);
    }
}
