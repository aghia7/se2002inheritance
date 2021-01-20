package com.company;

import java.time.LocalDate;

public class Train extends PassengerVehicle {

    public Train(String id, String name) {
        super(id, name);
    }

    public Train(String id, String name, LocalDate releaseDate) {
        super(id, name, releaseDate);
    }
}
