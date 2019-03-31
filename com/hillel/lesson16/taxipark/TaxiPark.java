package com.hillel.lesson16.taxipark;

import com.hillel.lesson16.car.impl.CarImpl;
import com.hillel.lesson16.exception.CarSearchException;

public interface TaxiPark {

    int costOfCars();

    void sortByConsumption();

    CarImpl[] findCarsBySpeed(int minSpeed, int maxSpeed) throws CarSearchException;

}
