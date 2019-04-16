package com.hillel.lesson16.taxipark.impl;

import com.hillel.lesson16.car.Car;
import com.hillel.lesson16.car.impl.CarImpl;
import com.hillel.lesson16.exception.CarSearchException;
import com.hillel.lesson16.taxipark.TaxiPark;

public class TaxiParkImpl implements TaxiPark {

    private Car[] taxiPark;

    public TaxiParkImpl(Car[] taxiPark) {
        this.taxiPark = taxiPark;
    }

    public int costOfCars() {
        int carParkCost = 0;

        for (Car car : taxiPark) {
            carParkCost += car.getPrice();
        }
        return carParkCost;
    }

    public void sortByConsumption() {

        for (int i = taxiPark.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (taxiPark[j].getConsumption() > taxiPark[j + 1].getConsumption()) {
                    Car temp = taxiPark[j];
                    taxiPark[j] = taxiPark[j + 1];
                    taxiPark[j + 1] = temp;
                }
            }
        }
    }

    public Car[] findCarsBySpeed(int minSpeed, int maxSpeed) throws CarSearchException {
        if (maxSpeed < 0 | minSpeed < 0 | maxSpeed < minSpeed)
            throw new CarSearchException(minSpeed, maxSpeed);
        Car[] carsBySpeed = null;

        for (Car car : taxiPark) {
            if (car.getMaxSpeed() <= maxSpeed & car.getMaxSpeed() >= minSpeed) {
                if (carsBySpeed == null) {
                    carsBySpeed = new CarImpl[1];
                    carsBySpeed[0] = car;
                } else {
                    Car[] tempCars = new Car[carsBySpeed.length + 1];

                    for (int i = 0; i < carsBySpeed.length; i++) {
                        tempCars[i] = carsBySpeed[i];
                    }
                    tempCars[tempCars.length - 1] = car;
                    carsBySpeed = tempCars;
                }
            }
        }
        return carsBySpeed;
    }

    public String toString() {
        int i = 0;
        String ok = "";
        for (; i < taxiPark.length; i++) {
            ok += taxiPark[i].toString() + "\n";
        }
        return ok;
    }
}
