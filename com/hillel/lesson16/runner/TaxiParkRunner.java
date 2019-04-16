package com.hillel.lesson16.runner;

import com.hillel.lesson16.car.Car;
//import com.hillel.lesson16.storage.CarsStorageImpl.FileCarsStorage;
import com.hillel.lesson16.car.impl.*;
import com.hillel.lesson16.exception.CarSearchException;
import com.hillel.lesson16.taxipark.TaxiPark;
import com.hillel.lesson16.taxipark.impl.TaxiParkImpl;

public class TaxiParkRunner {
    public static void main(String[] args) {

        Car[] listOfCars = new Car[]{
                new ElectricCar("NISSAN", "Leaf", "WHITE", 12345, 15000, 145, 15, 8),
                new ElectricCar("TESLA", "S", "BLACK", 12346, 40000, 193, 23.8, 8),
                new ElectricCar("BMW", "i3", "RED", 12347, 22000, 150, 12, 8),
                new DieselCar("RENAULT", "Sandero", "BLUE", 12348, 13200, 158, 3.9, 50, 6),
                new DieselCar("KIA", "Sportage", "WHITE", 12349, 25000, 177, 4.7, 58, 6),
                new DieselCar("CITROEN", "C-Eiysee", "BLUE", 12350, 18000, 160, 3.9, 50, 4),
                new PetrolCar("BMW", "X1", "BLACK", 12351, 30000, 201, 8.4, 63, 95),
                new PetrolCar("DAEWOO", "Lanos", "GREEN", 12352, 10000, 155, 7.2, 48, 92),
                new PetrolCar("CITROEN", "C4", "ORANGE", 12353, 20000, 181, 7.1, 60, 95)
        };

        TaxiPark taxiPark = new TaxiParkImpl(listOfCars);

        System.out.println();
        System.out.println("The cost of Taxi park is: " + taxiPark.costOfCars() + "$\n");

        System.out.println("Cars sorted by consumption:");
        taxiPark.sortByConsumption();
        System.out.println(taxiPark.toString());

        System.out.println("Cars by speed:");
        try {
            Car[] carsBySpeed = taxiPark.findCarsBySpeed(40, 160);

            for (Car car : carsBySpeed) {
                System.out.println(car.toString());
            }
        } catch (CarSearchException e) {
            System.out.println("Caught: " + e);
        }
    }
}
