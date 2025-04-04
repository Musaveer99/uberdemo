package com.project.uber.uberApp.dto;


import com.project.uber.uberApp.enitities.Driver;
import com.project.uber.uberApp.enitities.Rider;
import com.project.uber.uberApp.enitities.enums.PaymentMethod;
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
public class RideDTO {

    private Long id;

    private Point pickUpLocation;

    private Point dropLocation;

    private LocalDateTime createdTime;

    private RiderDTO rider;

    private DriverDTO driver;

    private PaymentMethod paymentMethod;

    private String otp;
    private RideStatus rideStatus;

    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;

}
