// Parent class: Vehicle
class Vehicle {
    int wheelsCount; // property

    // Default constructor
    Vehicle() {
        System.out.println("Creating a Vehicle instance");
    }

    // Parameterized constructor
    Vehicle(int wheelsCount) {
        this.wheelsCount = wheelsCount;
        System.out.println("Creating Vehicle with wheels: " + wheelsCount);
    }

    // Method to be overridden
    void start() {
        System.out.println("Vehicle is starting");
    }

    // Final method (cannot be overridden)
    final void accelerate() {
        System.out.println("Vehicle is accelerating");
    }
}

// Child class: Car
class Car extends Vehicle {
    String model;
    String color;

    // Default constructor
    Car() {
        super(4); // calling parent parameterized constructor
        System.out.println("Car is being created");
    }

    // Overriding parent method
    @Override
    void start() {
        // Using super keyword to refer to parent implementation
        super.start();
        System.out.println(model + " Car is starting");
        // Using 'this' to refer to current object's property
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
    }
}

public class inheritance {
    public static void main(String[] args) {
        // Final variable
        final int gears = 5; // Value cannot be changed

        Vehicle v1 = new Vehicle(2);
        v1.start();
        v1.accelerate(); // works

        Car car1 = new Car();
        car1.model = "i10";
        car1.color = "Red";
        car1.wheelsCount = 4;
        car1.start(); // Method overriding in action
        car1.accelerate(); // Inherited final method

        // gears = 6; // Not allowed, compile-time error due to final keyword

        // Uncommenting the below code will throw errors:
        // final class can't be inherited from
        // final class Vehicle {...}
        // class Car extends Vehicle {} // error!

        // final method can't be overridden:
        // @Override
        // void accelerate() {...} // error!
    }
}
