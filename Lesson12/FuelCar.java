package Lesson12;

abstract class FuelCar extends Car {
    private int tankCapacity;

    FuelCar(String brand, String model, String color, int registerNumber, int price, int maxSpeed,
            double consumption, int tankCapacity) {

        super(brand, model, color, registerNumber, price, maxSpeed, consumption);
        this.tankCapacity = tankCapacity;
    }

    public String toString() {
        return super.toString() + "; tankCapacity: " + tankCapacity;
    }


}
