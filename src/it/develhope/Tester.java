package it.develhope;

public class Tester {
    public static void main(String[] args) {

        Car myCar = new Car(5, 4, 20000);
        Boat myBoat = new Boat(35, 300);

        myCar.showVehicleDetails();
        myCar.doVehicleSound();
        System.out.println();

        myBoat.showVehicleDetails();
        myBoat.doVehicleSound();
        System.out.println(myBoat.getBoatWeightAndSpeed());

    }
}
