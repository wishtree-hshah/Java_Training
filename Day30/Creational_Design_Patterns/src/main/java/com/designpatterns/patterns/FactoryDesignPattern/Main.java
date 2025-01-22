package com.designpatterns.patterns.FactoryDesignPattern;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Vehicle vehicle1 = VehicleFactory.getVehicle("Car");
        vehicle1.drive();
        Vehicle vehicle2 = VehicleFactory.getVehicle("Bike");
        vehicle2.drive();
        Vehicle vehicle3 = VehicleFactory.getVehicle("Auto");
        vehicle3.drive();
    }
}
