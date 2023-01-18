package it.develhope;

class Boat extends Vehicle {
    public double maxKnotsSpeed;
    public int boatKilosWeight;

    @Override
    public void doVehicleSound() {
        System.out.println("Sound Boat");
    }

    public Boat(double maxKnotsSpeed, int boatKilosWeight){
        this.maxKnotsSpeed = maxKnotsSpeed;
        this.boatKilosWeight = boatKilosWeight;
    }

    public String getBoatWeightAndSpeed(){
        return "Weight: " + boatKilosWeight + " kg - Speed: " + maxKnotsSpeed + " knots";
    }
}
