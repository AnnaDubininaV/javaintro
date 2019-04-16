package com.hillel.lesson16.taxipark;

import com.hillel.lesson16.car.Car;
import com.hillel.lesson16.exception.CarSearchException;

public interface TaxiPark {

    int costOfCars();

    void sortByConsumption();

    Car[] findCarsBySpeed(int minSpeed, int maxSpeed) throws CarSearchException;
}
