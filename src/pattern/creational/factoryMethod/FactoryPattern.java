package pattern.creational.factoryMethod;

import java.util.Objects;

abstract class Vehicle {

    public abstract int getWheel();

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

//encapsulating the object creation logic
class VehicleFactory {
    //This method returns a new instance of a vehicle based on the given type and wheel count
    public static Vehicle getInstance(String type, int wheel) {

        if (Objects.equals(type, "car")) {   // Check the type and create the corresponding vehicle object
            return new Car(wheel);
        } else if (Objects.equals(type, "bike")) {
            return new Bike(wheel);
        }
        return null;
    }
}

public class FactoryPattern {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getInstance("car", 4);
        System.out.println(car);    //Wheel: 4

        Vehicle bike = VehicleFactory.getInstance("bike", 2);
        System.out.println(bike);  //Wheel: 2
    }
}