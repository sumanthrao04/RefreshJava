package com.corejava.oopsconcept.encapsulation;


//Java program that shows both Abstraction and Encapsulation working together.
// Abstraction: Interface hides the details of how methods are implemented
interface Car {
    void start();    // abstract method
    void stop();
    void accelerate(int speed);
}

// Encapsulation: Wrapping data & methods with controlled access
class ElectricCar implements Car {
    // private variable (Encapsulation)
    private int speed;

    // Getter (Encapsulation)
    public int getSpeed() {
        return speed;
    }

    // Setter with control (Encapsulation)
    public void setSpeed(int speed) {
        if (speed > 0 && speed <= 200) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed! Setting to default (0).");
            this.speed = 0;
        }
    }

    // Implementing abstract methods (Abstraction)
    @Override
    public void start() {
        System.out.println("Electric Car started silently ⚡");
    }

    @Override
    public void stop() {
        System.out.println("Electric Car stopped.");
    }

    @Override
    public void accelerate(int speed) {
        setSpeed(speed); // using encapsulated setter
        System.out.println("Accelerating to " + this.speed + " km/h...");
    }
}

// Main class to test
public class AbstractionEncapsulationDemo {
    public static void main(String[] args) {
        // Abstraction: We use the Car interface, not worrying about actual implementation
        Car myCar = new ElectricCar();

        myCar.start();
        myCar.accelerate(120);   // valid speed
        myCar.accelerate(300);   // invalid speed, setter protects data
        myCar.stop();

        // Encapsulation: Direct access to 'speed' is not possible (private)
        // But we can use getter
        ElectricCar ec = new ElectricCar();
        ec.accelerate(150);
        System.out.println("Current Speed (via getter): " + ec.getSpeed());
    }
}
