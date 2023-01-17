package it.develhope;

class Car extends Vehicle {
    public int numberOfDoors;
    public double carPrice;

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("Number of door: " + numberOfDoors);
    }

    @Override
    public void doVehicleSound() {
        System.out.println("Sound car");
    }

    public Car(int numberOfDoors, int numberOfWheels, double carPrice){
        this.type = "Car";
        this.carPrice = 20000;
        this.numberOfDoors = 5;
        this.numberOfWheels = 4;
    }
}
