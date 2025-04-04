package com.project.uber.uberApp.Strategies.StrategyImpl;

import com.project.uber.uberApp.Strategies.DriverMatchingStrategy;
import com.project.uber.uberApp.dto.RideRequestDTO;
import com.project.uber.uberApp.enitities.Driver;
import com.project.uber.uberApp.enitities.RideRequest;
import com.project.uber.uberApp.repositories.DriverRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {

    private final DriverRepository driverRepository;
    @Override
    public List<Driver> findMatchingDrivers(RideRequest rideRequest) {
        return driverRepository.findTenNearestDrivers(rideRequest.getPickUpLocation());
    }
}
