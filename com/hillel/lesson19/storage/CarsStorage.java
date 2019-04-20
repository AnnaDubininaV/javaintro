package com.hillel.lesson19.storage;

import com.hillel.lesson19.car.Car;

import java.util.List;

public interface CarsStorage {

    List<Car> readCars();

    void writeCars(List <Car> cars);
}
