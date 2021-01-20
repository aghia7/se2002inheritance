package com.company;

import java.time.LocalDate;

public class Bus extends PassengerVehicle {
    private String busNumber;

    public Bus(String id, String name) {
        super(id, name);
    }

    public Bus(String id, String name, LocalDate releaseDate) {
        super(id, name, releaseDate);
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    @Override
    public String toString() {
        return "id: " + getId() + " , " +
                "name: " + getName() + " , " +
                "released at: " + getReleaseDate() + " , " +
                "bus number: " + busNumber + "";
    }
}
