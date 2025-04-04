package com.project.uber.uberApp.Strategies.StrategyImpl;

import com.project.uber.uberApp.Strategies.DriverMatchingStrategy;
import com.project.uber.uberApp.dto.RideRequestDTO;
import com.project.uber.uberApp.enitities.Driver;
import com.project.uber.uberApp.enitities.RideRequest;

import java.util.List;

public class DriverMatchingHighestRatedStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDrivers(RideRequest rideRequest) {
        return List.of();
    }
}
