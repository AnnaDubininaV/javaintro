package com.hillel.lesson16.car.impl;

public class ElectricCar extends CarImpl {
    private int batteryChargeTime;

    public ElectricCar(String brand, String model, String color, int registerNumber, int price,
                int maxSpeed, double consumption, int batteryChargeTime) {

        super(brand, model, color, registerNumber, price, maxSpeed, consumption);
        this.batteryChargeTime = batteryChargeTime;
    }

    public ElectricCar (String [] carProperties) {
        super(carProperties);
        this.batteryChargeTime = Integer.parseInt(carProperties[8]);

    }

    public String toString() {
        return "ElectricCar [" + super.toString() + "; battery charge time: " + batteryChargeTime + "]";
    }

    public double getConsumption() {
        super.setConsumption(0);
        return super.getConsumption();
    }

   public int getBatteryChargeTime() {
        return batteryChargeTime;
    }

    public String toFileFormat (){
        return  "ElectricCar, " + getBrand() + ", " + getModel() + ", " + getColor() + ", " + getRegisterNumber() +
                ", " + getPrice() + ", " + getMaxSpeed() + ", " + getConsumption()+ ", " + getBatteryChargeTime();
    }
}
