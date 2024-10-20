package pattern.creational.factoryMethod;

import java.util.Objects;

/**
 * This abstract class represents a vehicle. It provides a method to get the number of wheels and a toString method to display the wheel count.
 */
abstract class Vehicle {
    /**
     * This method returns the number of wheels for the vehicle.
     *
     * @return the number of wheels
     */
    public abstract int getWheel();

    /**
     * This method returns a string representation of the vehicle, displaying the number of wheels.
     *
     * @return a string representation of the vehicle
     */
    public String toString() {
        return "Wheel: " + this.getWheel();
    }
}

class Car extends Vehicle {
    int wheel;

    Car(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public int getWheel() {
        return this.wheel;
    }
}

class Bike extends Vehicle {
    int wheel;

    Bike(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public int getWheel() {
        return this.wheel;
    }
}

/**
 * This class provides a method to create instances of different types of vehicles based on the given type and wheel count.
 * It implements the Factory Method design pattern, encapsulating the object creation logic.
 */
class VehicleFactory {
    /**
     * This method returns a new instance of a vehicle based on the given type and wheel count.
     *
     * @param type  the type of vehicle to create. It can be either "car" or "bike".
     * @param wheel the number of wheels for the vehicle.
     * @return a new instance of the specified vehicle type with the given wheel count.
     *         If the type is not recognized, it returns null.
     */
    public static Vehicle getInstance(String type, int wheel) {
        // Check the type and create the corresponding vehicle object
        if(Objects.equals(type, "car")) {
            return new Car(wheel);
        } else if(Objects.equals(type, "bike")) {
            return new Bike(wheel);
        }
        // Return null if the type is not recognized
        return null;
    }
}

public class FactoryPattern {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getInstance("car", 4);
        System.out.println(car);

        Vehicle bike = VehicleFactory.getInstance("bike", 2);
        System.out.println(bike);
    }
}