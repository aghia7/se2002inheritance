package com.company;

public class Car {
    private final Engine engine; // Composition
    private Driver driver; // Aggregation

    public Car(Engine engine) {

        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", driver=" + driver +
                '}';
    }
}
