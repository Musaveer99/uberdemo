package com.project.uber.uberApp.repositories;

import com.project.uber.uberApp.enitities.Driver;
import org.locationtech.jts.geom.Point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {


//ST_Distance (point1, point2)
//ST_DWithin (point1, 10000)
    @Query("SELECT d.*, ST_Distance (d.current_location, :pickupLocation) AS distance " +
            "FROM drivers AS d " +
            "where available = true AND ST_DWithin (d.current_location, pickup Location, 10000) " +
            "ORDER BY distance " +
            "LIMIT 10")
    List<Driver> findTenNearestDrivers(Point pickUpLocation);
}
