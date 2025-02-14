package DesignPatterns.SingleTon.Factory;

//Note:Power companies manage multiple energy sources: solar, wind, hydro, nuclear, and thermal.
//Instead of hardcoding each power source, a Factory can create them dynamically.


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

class VehicleFactory {
    public static Vehicle getInstance(String type, int wheel) {
        if(type == "car") {
            return new Car(wheel);
        } else if(type == "bike") {
            return new Bike(wheel);
        }

        return null;
    }
}

public class FactoryPatternExample {

    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getInstance("car", 4);
        System.out.println(car);

        Vehicle bike = VehicleFactory.getInstance("bike", 2);
        System.out.println(bike);
    }

}

//Why Use the Factory Pattern?
//Encapsulation: The creation logic is hidden inside VehicleFactory.
//Loose Coupling: The client code (main) only interacts with Vehicle and doesn’t worry about instantiation.
//Scalability: If new vehicle types (e.g., Truck, Bus) are added, we can extend Vehicle and update VehicleFactory
//without changing existing code.


//Real-World Analogy
//Think of a vehicle manufacturing plant:
//
//A customer orders a car or bike.
//Instead of them building it, they just request the factory.
//The factory decides and creates the right type based on input.