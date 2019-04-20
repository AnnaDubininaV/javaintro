package com.hillel.lesson19.taxipark;

import com.hillel.lesson19.car.Car;
import com.hillel.lesson19.exception.CarSearchException;

import java.util.List;

public interface TaxiPark {

    int costOfCars();

    void sortByConsumption();

    List<Car> findCarsBySpeed(int minSpeed, int maxSpeed) throws CarSearchException;
}
