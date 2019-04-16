package com.hillel.lesson16.runner;

import com.hillel.lesson16.car.Car;
import com.hillel.lesson16.exception.CarSearchException;
import com.hillel.lesson16.storage.CarsStorageImpl.FileCarsStorage;
import com.hillel.lesson16.taxipark.TaxiPark;
import com.hillel.lesson16.taxipark.impl.TaxiParkImpl;

public class TaxiParkFromFile_Runner {

    public static void main(String[] args) {

        FileCarsStorage storage = new FileCarsStorage("InputCars.txt", "OutputCars.txt");

        Car[] cars = storage.readCars();

        TaxiPark taxiPark = new TaxiParkImpl(cars);

        System.out.println("The cost of Taxi park is: " + taxiPark.costOfCars() + "$\n");

        System.out.println("Cars sorted by consumption:");
        taxiPark.sortByConsumption();
        System.out.println(taxiPark.toString());

        storage.writeCars(cars);

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
