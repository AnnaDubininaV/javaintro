package com.hillel.lesson16.car.impl;

import com.hillel.lesson16.car.ICar;

public abstract class Car implements ICar {

    private String brand;
    private String model;
    private String color;
    private int registerNumber;
    private int price;
    private int maxSpeed;
    private double consumption;

    Car (String brand, String model, String color, int registerNumber, int price, int maxSpeed, double consumption) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registerNumber = registerNumber;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.consumption = consumption;
    }

    public String toString() {
        return "mark: " + this.brand + "; model: " + this.model + "; color: "
                + this.color + "; register number: " + this.registerNumber + "; price: " + this.price + "; max speed: "
                + this.maxSpeed + "; consumption: " + this.consumption;
    }

    public int getPrice () {
        return price;
    }

    public void setPrice (int price) {
        this.price = price;
    }

    public int getMaxSpeed () {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getConsumption () {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }
}
