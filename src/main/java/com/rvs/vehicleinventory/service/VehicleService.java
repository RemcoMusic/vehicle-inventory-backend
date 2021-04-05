package com.rvs.vehicleinventory.service;

import com.rvs.vehicleinventory.domain.Vehicle;
import com.rvs.vehicleinventory.exception.VehicleNotFoundException;
import com.rvs.vehicleinventory.repo.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
    private final VehicleRepo vehicleRepo;

    @Autowired
    public VehicleService(VehicleRepo vehicleRepo) {
        this.vehicleRepo = vehicleRepo;
    }

    public Vehicle addVehicle(Vehicle vehicle){
        return vehicleRepo.save(vehicle);
    }

    public List<Vehicle> findAllVehicles() {
        return vehicleRepo.findAll();
    }

    public Vehicle updateVehicle(Vehicle vehicle) {
        return vehicleRepo.save(vehicle);
    }

    public void deleteVehicle(Long id) {
        vehicleRepo.deleteById(id);
    }

    public Vehicle findVehicleById(Long id) {
        return vehicleRepo.findById(id)
                .orElseThrow(() -> new VehicleNotFoundException("Vehicle not found!"));
    }
}
