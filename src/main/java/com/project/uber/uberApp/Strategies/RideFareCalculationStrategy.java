package com.project.uber.uberApp.Strategies;

import com.project.uber.uberApp.dto.RideRequestDTO;
import com.project.uber.uberApp.enitities.RideRequest;

public interface RideFareCalculationStrategy {

    double Ride_fare_multiplier=10;

    double calculateFare(RideRequest rideRequest);

}
