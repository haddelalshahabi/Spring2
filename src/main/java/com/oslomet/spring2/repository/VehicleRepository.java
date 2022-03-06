package com.oslomet.spring2.repository;

import org.springframework.stereotype.Repository;
import com.oslomet.spring2.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VehicleRepository {

    private final List<Vehicle> list = new ArrayList<>();

    public void addVehicle(Vehicle vehicle){
        list.add(vehicle);
    }

    public List<Vehicle> getVehicles(){
        return list;
    }

    public void deleteVehicles(){
        list.clear();
    }

}