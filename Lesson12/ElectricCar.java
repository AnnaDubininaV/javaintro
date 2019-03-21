package Lesson12;

public class ElectricCar extends Car {
    private int batteryChargeTime;

    ElectricCar(String brand, String model, String color, int registerNumber, int price,
                int maxSpeed, double consumption, int batteryChargeTime) {

        super(brand, model, color, registerNumber, price, maxSpeed, consumption);
        this.batteryChargeTime = batteryChargeTime;
    }

    public String toString() {
        return "ElectricCar [" + super.toString() + "; battery charge time: " + batteryChargeTime + "]";
    }

    public double getConsumption() {
        super.setConsumption(0);
        return super.getConsumption();
    }
}
