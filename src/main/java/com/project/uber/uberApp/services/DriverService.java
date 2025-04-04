package com.project.uber.uberApp.services;

import com.project.uber.uberApp.dto.DriverDTO;
import com.project.uber.uberApp.dto.RideDTO;
import com.project.uber.uberApp.dto.RiderDTO;

public interface DriverService {


 RideDTO acceptRide(Long rideId);
 RideDTO cancelRide(Long rideId);

 RideDTO startRide(Long rideId);

 RideDTO endRide(Long rideId);

 RiderDTO rateRider(Long rideId, Integer rating);

 DriverDTO getMyProfile();



}
