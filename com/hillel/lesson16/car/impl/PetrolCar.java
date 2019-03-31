package com.hillel.lesson16.car.impl;

public class PetrolCar extends FuelCar {
    private int gasolineGrade;

    public PetrolCar(String brand, String model, String color, int registerNumber, int price, int maxSpeed,
              double consumption, int tankCapacity, int gasolineGrade) {

        super(brand, model, color, registerNumber, price, maxSpeed, consumption, tankCapacity);
        this.gasolineGrade = gasolineGrade;
    }

    public String toString() {
        return "PetrolCar [" + super.toString() + "; gasolineGrade: " + gasolineGrade + "].";
    }
}
