package com.hillel.lesson16.car.impl;

public class PetrolCar extends FuelCar {
    private int gasolineGrade;

    public PetrolCar(String brand, String model, String color, int registerNumber, int price, int maxSpeed,
              double consumption, int tankCapacity, int gasolineGrade) {

        super(brand, model, color, registerNumber, price, maxSpeed, consumption, tankCapacity);
        this.gasolineGrade = gasolineGrade;
    }

    public PetrolCar (String [] carProperties) {
        super(carProperties);
        this.gasolineGrade = Integer.parseInt(carProperties[9]);
    }

    public String toString() {
        return "PetrolCar [" + super.toString() + "; gasolineGrade: " + gasolineGrade + "].";
    }

    public int getGasolineGrade() {
        return gasolineGrade;
    }

    public String toFileFormat (){
        return  "PetrolCar, " + getBrand() + ", " + getModel() + ", " + getColor() + ", " + getRegisterNumber() +
                ", " + getPrice() + ", " + getMaxSpeed() + ", " + getConsumption()+ ", " + getTankCapacity() +
                ", " + getGasolineGrade();
    }
}
