package it.develhope;

public abstract class Vehicle {
    public String type;
    public int numberOfWheels;

    public void showVehicleDetails(){
        System.out.println("Type: " + type + " - Numbers of wheel: " + numberOfWheels);
    }
    public abstract void doVehicleSound();
}
