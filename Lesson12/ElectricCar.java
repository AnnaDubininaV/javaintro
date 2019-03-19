package Lesson12;

public class ElectricCar extends Car {
    int batteryChargeTime;

    ElectricCar (String typeOfEngine, String brand, String model, String color, int registerNumber, int price,
                 int maxSpeed, double consumption, int batteryChargeTime) {

        super(typeOfEngine, brand, model, color, registerNumber, price, maxSpeed, consumption);
        this.batteryChargeTime = batteryChargeTime;
    }

    public String toString () {
        return super.toString();
    }
}
