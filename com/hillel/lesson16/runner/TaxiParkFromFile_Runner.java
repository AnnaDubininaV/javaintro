package com.hillel.lesson16.runner;

import com.hillel.lesson16.ReaderAndWriter;
import com.hillel.lesson16.car.impl.CarImpl;
import com.hillel.lesson16.exception.CarSearchException;
import com.hillel.lesson16.taxipark.TaxiPark;
import com.hillel.lesson16.taxipark.impl.TaxiParkImpl;

import java.io.IOException;

public class TaxiParkFromFile_Runner {
    public static void main(String[] args) {

        TaxiPark taxiPark = null;
        try {
            taxiPark = new TaxiParkImpl(ReaderAndWriter.createListOfCars("TaxiPark.txt"));
        } catch (IOException e) {
            System.out.println("Exception");
        }

        System.out.println();
        System.out.println("The cost of Taxi park is: " + taxiPark.costOfCars() + "$\n");

        System.out.println("Cars sorted by consumption:");
        taxiPark.sortByConsumption();
        System.out.println(taxiPark.toString());

        ReaderAndWriter.printCarToFile(taxiPark, "CarsByConsumption.txt");

        System.out.println("Cars by speed:");
        CarImpl[] carsBySpeed = null;
        try {
            carsBySpeed = taxiPark.findCarsBySpeed(40, 160);

            for (CarImpl car : carsBySpeed) {
                System.out.println(car.toString());
            }
        } catch (CarSearchException e) {
            System.out.println("Caught: " + e);
        }

        ReaderAndWriter.printCarToFile(carsBySpeed, "CarsBySpeed");
    }
}
