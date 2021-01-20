package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class PassengerVehicle extends Vehicle {
    private ArrayList<Passenger> passengers = new ArrayList<>();

    public PassengerVehicle(String id, String name) {
        super(id, name);
    }

    public PassengerVehicle(String id, String name, LocalDate releaseDate) {
        super(id, name, releaseDate);
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }
}
