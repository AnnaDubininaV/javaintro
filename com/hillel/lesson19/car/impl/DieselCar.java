package com.hillel.lesson19.car.impl;

public class DieselCar extends FuelCar {
    private  int glowPlug;

    public DieselCar(String brand, String model, String color, int registerNumber, int price, int maxSpeed,
              double consumption, int tankCapacity, int glowPlug) {

        super(brand, model, color, registerNumber, price, maxSpeed, consumption, tankCapacity);
        this.glowPlug = glowPlug;
    }

    public DieselCar (String [] carProperties) {
        super(carProperties);
        this.glowPlug = Integer.parseInt(carProperties[9]);
    }

    public String toString() {
        return "DieselCar [" + super.toString() + "; glow plug: " + glowPlug + "].";
    }

    public int getGlowPlug() {
        return glowPlug;
    }

    public String toFileFormat (){
        return  "DieselCar, " + getBrand() + ", " + getModel() + ", " + getColor() + ", " + getRegisterNumber() +
                ", " + getPrice() + ", " + getMaxSpeed() + ", " + getConsumption()+ ", " + getTankCapacity() +
                ", " + getGlowPlug();
    }
}
