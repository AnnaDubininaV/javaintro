package com.hillel.lesson19.runner;

import com.hillel.lesson19.car.Car;
import com.hillel.lesson19.exception.CarSearchException;
import com.hillel.lesson19.storage.CarsStorageImpl.FileCarsStorage;
import com.hillel.lesson19.taxipark.TaxiPark;
import com.hillel.lesson19.taxipark.impl.TaxiParkImpl;

import java.util.List;

public class TaxiParkFromFile_Runner {

    public static void main(String[] args) {

        FileCarsStorage storage = new FileCarsStorage("InputCars.txt", "OutputCars.txt");

        List<Car> cars = storage.readCars();

        TaxiPark taxiPark = new TaxiParkImpl(cars);

        System.out.println("The cost of Taxi park is: " + taxiPark.costOfCars() + "$\n");

        System.out.println("Cars sorted by consumption:");
        taxiPark.sortByConsumption();
        System.out.println(taxiPark.toString());

        storage.writeCars(cars);

        System.out.println("Cars by speed:");

        try {
            List <Car> carsBySpeed = taxiPark.findCarsBySpeed(40, 160);

            for (Car car : carsBySpeed) {
                System.out.println(car.toString());
            }
        } catch (CarSearchException e) {
            System.out.println("Caught: " + e);
        }
    }
}
