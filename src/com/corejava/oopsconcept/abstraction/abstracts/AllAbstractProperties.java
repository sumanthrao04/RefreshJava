package com.corejava.oopsconcept.abstraction.abstracts;
// Abstract class can have both abstract and non-abstract methods
abstract class CarFeatures{

    // Abstract method: must be overridden
    abstract void turnon();
    abstract  void turnoff();

    // Non-abstract (concrete) method
    void showBrand(){
        System.out.println(" Brand : TATA ");
    }

    // Final method: cannot be overridden
    final void CarType(){
        System.out.println(" Engine type : Petrol");
    }

    // Static method: belongs to class, not instance
    static void modelType(){
        System.out.println("Car Model type : XUV");
    }


}

// Concrete class must implement all abstract methods
class Nexon extends CarFeatures{

    @Override
    void turnon() {
        System.out.println("Nexon Car is turning ON...");
    }

    @Override
    void turnoff() {
        System.out.println("Nexon Car is turning OFF...");
    }

    // Trying to override final method would cause an error:
    // void CarType() { }  Not allowed


}

public class AllAbstractProperties {

    public static void main(String[] args) {
        CarFeatures nexonCar = new Nexon(); // Upcasting demonstrates polymorphism.
        nexonCar.turnon(); // Calls overridden method
        nexonCar.turnoff(); // Calls overridden method
        nexonCar.showBrand(); // Calls concrete method in abstract class
        nexonCar.CarType(); // Calls final method
        CarFeatures.modelType(); // Calls static method

    }




}
