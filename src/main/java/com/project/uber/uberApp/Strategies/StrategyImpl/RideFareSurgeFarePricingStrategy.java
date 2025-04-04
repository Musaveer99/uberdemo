package com.project.uber.uberApp.Strategies.StrategyImpl;

import com.project.uber.uberApp.Strategies.RideFareCalculationStrategy;
import com.project.uber.uberApp.dto.RideRequestDTO;
import com.project.uber.uberApp.enitities.RideRequest;

public class RideFareSurgeFarePricingStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequest rideRequest) {
        return 0;
    }
}
