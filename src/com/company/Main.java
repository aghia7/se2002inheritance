package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
//        LocalDate date = LocalDate.parse("15/02/2014", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//        Vehicle bus = new Bus("156548", "VW 150", date);
//
//        ((Bus) bus).setBusNumber("30A");
//
//        System.out.println(bus);

        User user = new User("Bake", "Myrkynbayev");

        user.setEmail("askar.khaimuldin@astanait.edu.kz");

        System.out.println(user);

    }
}
