package com.hillel.lesson16.car;

public interface Car {

    int getPrice();

    void setPrice(int price);

    int getMaxSpeed();

    void setMaxSpeed(int maxSpeed);

    double getConsumption();

    void setConsumption(double consumption);

    default String toFileFormat (){
        return "";
    }
}
