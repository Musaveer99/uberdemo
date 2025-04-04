package com.project.uber.uberApp.Strategies.StrategyImpl;

import com.project.uber.uberApp.Strategies.RideFareCalculationStrategy;
import com.project.uber.uberApp.dto.RideRequestDTO;
import com.project.uber.uberApp.enitities.RideRequest;
import com.project.uber.uberApp.services.DistanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RideFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {

    private final DistanceService distanceService;
    @Override
    public double calculateFare(RideRequest rideRequest) {

        double distance = distanceService.calculateDistance(rideRequest.getPickUpLocation(), rideRequest.getDropLocation());
        return distance*Ride_fare_multiplier;
    }
}
