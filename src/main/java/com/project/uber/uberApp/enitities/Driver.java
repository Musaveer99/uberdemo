package com.project.uber.uberApp.enitities;


import jakarta.persistence.*;
import org.locationtech.jts.geom.Point;


@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double rating;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Boolean available;

    private String vehicleId;

    @Column(columnDefinition = "geometry(Point, 4326)")
    private Point currentLocation;

}
