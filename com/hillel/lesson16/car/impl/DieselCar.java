package com.hillel.lesson16.car.impl;

public class DieselCar extends FuelCar {
    private int glowPlug;

    public DieselCar(String brand, String model, String color, int registerNumber, int price, int maxSpeed,
              double consumption, int tankCapacity, int glowPlug) {

        super(brand, model, color, registerNumber, price, maxSpeed, consumption, tankCapacity);
        this.glowPlug = glowPlug;
    }

    public String toString() {
        return "DieselCar [" + super.toString() + "; glow plug: " + glowPlug + "].";
    }

}
