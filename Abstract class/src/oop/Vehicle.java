package oop;

public abstract class Vehicle {
    Vehicle()
    {
        System.out.println("\nVehicle class called");
    }
    void speedList()
    {
        System.out.println("Please control your speed");

    }
    //abstract
    abstract void run();


}

