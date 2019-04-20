package com.hillel.lesson19.taxipark.impl;

import com.hillel.lesson19.car.Car;
import com.hillel.lesson19.car.impl.CarImpl;
import com.hillel.lesson19.exception.CarSearchException;
import com.hillel.lesson19.taxipark.TaxiPark;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TaxiParkImpl implements TaxiPark {

    private List <Car> taxiPark;

    public TaxiParkImpl(List <Car> taxiPark) {
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

        for (int i = taxiPark.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (taxiPark.get(j).getConsumption() > taxiPark.get(j + 1).getConsumption()) {
                    Car temp = taxiPark.get(j);
                    taxiPark.set(j, taxiPark.get(j + 1));
                    taxiPark.set((j + 1), temp);
                }
            }
        }
    }

    public List <Car> findCarsBySpeed(int minSpeed, int maxSpeed) throws CarSearchException {
        if (maxSpeed < 0 | minSpeed < 0 | maxSpeed < minSpeed)
            throw new CarSearchException(minSpeed, maxSpeed);
        List <Car> carsBySpeed = new ArrayList<>();

        for (Car car : taxiPark) {
            if (car.getMaxSpeed() <= maxSpeed & car.getMaxSpeed() >= minSpeed) {
                carsBySpeed.add(car);
            }
        }
        return carsBySpeed;
    }

    public String toString() {
        String ok = "";
        for (Car car: taxiPark) {
            ok += car.toString() + "\n";
        }
        return ok;
    }
}
