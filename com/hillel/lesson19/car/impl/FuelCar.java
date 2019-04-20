package com.hillel.lesson19.car.impl;

abstract class FuelCar extends CarImpl {
    private  int tankCapacity;

    public FuelCar(String brand, String model, String color, int registerNumber, int price, int maxSpeed,
            double consumption, int tankCapacity) {

        super(brand, model, color, registerNumber, price, maxSpeed, consumption);
        this.tankCapacity = tankCapacity;
    }

    public FuelCar (String [] carProperties) {
        super(carProperties);
        this.tankCapacity = Integer.parseInt(carProperties [8]);
    }

    public String toString() {
        return super.toString() + "; tankCapacity: " + tankCapacity;
    }

    public  int getTankCapacity() {
        return tankCapacity;
    }
}
