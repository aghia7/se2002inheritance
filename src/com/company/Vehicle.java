package com.company;

import java.time.LocalDate;

public class Vehicle {
    private String id;
    private String name;
    private LocalDate releaseDate;

    public Vehicle(String id, String name) {
        setId(id);
        setName(name);
        releaseDate = LocalDate.now();
    }

    public Vehicle(String id, String name, LocalDate releaseDate) {
        setId(id);
        setName(name);
        setReleaseDate(releaseDate);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
