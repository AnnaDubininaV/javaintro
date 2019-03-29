package com.hillel.lesson16.taxipark;

import com.hillel.lesson16.car.impl.Car;

public interface ITaxiPark {

    int costOfCars();

    void sortByConsumption();

    Car[] findCarsBySpeed(int minSpeed, int maxSpeed);

}
