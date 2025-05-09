package com.project.uber.uberApp.repositories;

import com.project.uber.uberApp.enitities.Driver;
import com.project.uber.uberApp.enitities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<Ride, Long> {
}
