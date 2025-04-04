package com.project.uber.uberApp.Strategies;

import com.project.uber.uberApp.dto.RideRequestDTO;
import com.project.uber.uberApp.enitities.Driver;
import com.project.uber.uberApp.enitities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDrivers(RideRequest rideRequest);
}
