package it.develhope;

public class Tester {
    public static void main(String[] args) {

        Car myCar = new Car(5, 4, 2000);
        myCar.type = "Car";
        Boat myBoat = new Boat(35, 300);
        myBoat.type = "Boat";
        myBoat.numberOfWheels = 0;


        myCar.showVehicleDetails();
        myCar.doVehicleSound();
        System.out.println();

        myBoat.showVehicleDetails();
        myBoat.doVehicleSound();
        System.out.println(myBoat.getBoatWeightAndSpeed());
    }   
    }
