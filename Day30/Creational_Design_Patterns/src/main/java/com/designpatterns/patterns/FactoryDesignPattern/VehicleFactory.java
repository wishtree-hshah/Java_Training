package com.designpatterns.patterns.FactoryDesignPattern;

/**
 * The type Vehicle factory.
 */
class VehicleFactory {
    /**
     * Gets vehicle.
     *
     * @param vehicleType the vehicle type
     * @return the vehicle
     */
    public static Vehicle getVehicle(String vehicleType) {
        if (vehicleType.equalsIgnoreCase("Car")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("Bike")) {
            return new Bike();
        } else if (vehicleType.equalsIgnoreCase("Auto")) {
            return new Auto();
        }
        return null;
    }
}
