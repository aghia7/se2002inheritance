package com.company;

public class Engine {
    private String name;
    private double power;

    public Engine(String name, double power) {
        setName(name);
        setPower(power);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{ power=" + power + ", " +
                "name='" + name + '\'' +
                '}';
    }
}
