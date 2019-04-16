package com.hillel.lesson16.storage;

import com.hillel.lesson16.car.Car;

public interface CarsStorage {

    Car[] readCars ();

    void writeCars (Car [] cars);
}
