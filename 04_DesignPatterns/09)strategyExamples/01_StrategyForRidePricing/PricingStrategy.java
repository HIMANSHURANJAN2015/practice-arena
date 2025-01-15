package com.assignment.question;

//step-1: Create an abstract strategy interface
public interface PricingStrategy {
    double BASE_FARE = 5.0; // Base fare amount
   
    public PricingType supportsType();
    /*
    Java treats double and Double differently in method overloading anf over riding
    Test cases were expecting Double and so double gave error
    */
    public Double calculateRidePrice(RideDetails rideDetails);

}