abstract class Vehicle {
    /**
     *
     * @return
     */
    // Abstract method to calculate the fuel efficiency
    abstract double fuelEfficiency();

    // Concrete method to display vehicle details
    public void displayDetails() {
        System.out.println("Fuel Efficiency: " + fuelEfficiency() + " km/l");
    }
}

class Car extends Vehicle {
    private double distance;
    private double fuel;

    /**
     *
     * @param distance
     * @param fuel
     */
    // Constructor for Car
    public Car(double distance, double fuel) {
        this.distance = distance;
        this.fuel = fuel;
    }

    /**
     *
     * @return
     */
    // Implement the abstract method for Car
    @Override
    double fuelEfficiency() {
        return distance / fuel;  // Fuel efficiency in km/l
    }
}

public class AbstractMethodExample {
    public static void main(String[] args) {
        Vehicle car = new Car(500, 25);
        System.out.println("Car:");
        car.displayDetails();
    }
}
