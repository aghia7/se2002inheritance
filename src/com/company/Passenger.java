package com.company;

import java.time.LocalDate;

public class Passenger {
    private String fullname;
    private LocalDate enteredAt;

    public Passenger(String fullname) {
        this.fullname = fullname;
        enteredAt = LocalDate.now();
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public LocalDate getEnteredAt() {
        return enteredAt;
    }

    public void setEnteredAt(LocalDate enteredAt) {
        this.enteredAt = enteredAt;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "fullname='" + fullname + '\'' +
                ", enteredAt=" + enteredAt +
                '}';
    }
}
