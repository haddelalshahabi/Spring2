package com.oslomet.spring2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oslomet.spring2.model.Vehicle;
import com.oslomet.spring2.repository.VehicleRepository;

import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    VehicleRepository repository;

    @PostMapping("/api")
    public void add(Vehicle vehicle){
        repository.addVehicle(vehicle);
    }

    @GetMapping("/api")
    public List<Vehicle> getAll(){
        return repository.getVehicles();
    }

    @DeleteMapping("/api")
    public void deleteAll(){
        repository.deleteVehicles();
    }
}
