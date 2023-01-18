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
        this.carPrice = carPrice;
        this.numberOfDoors = numberOfDoors;
        this.numberOfWheels = numberOfWheels;
    }
}
