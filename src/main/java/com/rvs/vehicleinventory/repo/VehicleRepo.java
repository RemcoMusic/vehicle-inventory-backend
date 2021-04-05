package com.rvs.vehicleinventory.repo;

import com.rvs.vehicleinventory.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<Vehicle, Long> {

}
