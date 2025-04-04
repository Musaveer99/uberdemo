package com.project.uber.uberApp.enitities;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.Point;
import org.hibernate.annotations.CreationTimestamp;

import com.project.uber.uberApp.enitities.enums.PaymentMethod;
import com.project.uber.uberApp.enitities.enums.RideRequestStatus;


@Entity
@Getter
@Setter
public class RideRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

     @Column(columnDefinition = "Geometry(Point, 4326)")
     private Point pickUpLocation;

     @Column(columnDefinition = "Geometry(Point, 4326)")
     private Point dropLocation;

     @CreationTimestamp
     private LocalDateTime requstedTime;

    @ManyToOne(fetch = FetchType.LAZY)
    private Rider rider;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    private RideRequestStatus rideRequestStatus;

    private Double Fare;



}
