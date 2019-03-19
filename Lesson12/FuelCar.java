package Lesson12;

abstract class FuelCar extends Car {
    int tankCapacity;

    FuelCar(String typeOfEngine, String brand, String model, String color, int registerNumber, int price, int maxSpeed,
            double consumption, int tankCapacity) {

        super(typeOfEngine, brand, model, color, registerNumber, price, maxSpeed, consumption);
        this.tankCapacity = tankCapacity;
    }

    public String toString() {
        return super.toString();
    }


}
