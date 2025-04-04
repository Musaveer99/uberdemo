package com.project.uber.uberApp.dto;


import com.project.uber.uberApp.enitities.Driver;
import com.project.uber.uberApp.enitities.Rider;
import com.project.uber.uberApp.enitities.enums.PaymentMethod;
import com.project.uber.uberApp.enitities.enums.RideRequestStatus;
import com.project.uber.uberApp.enitities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideRequestDTO {

    private Long id;

    private PointDTO pickUpLocation;

    private PointDTO dropLocation;
    private PaymentMethod paymentMethod;
    private LocalDateTime requestedTime;

    private RiderDTO rider;

    private RideRequestStatus rideRequestStatus;
}
