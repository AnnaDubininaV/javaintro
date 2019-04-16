package com.hillel.lesson16.storage.CarsStorageImpl;

import com.hillel.lesson16.car.Car;
import com.hillel.lesson16.car.impl.CarImpl;
import com.hillel.lesson16.car.impl.DieselCar;
import com.hillel.lesson16.car.impl.ElectricCar;
import com.hillel.lesson16.car.impl.PetrolCar;
import com.hillel.lesson16.storage.CarsStorage;
import com.hillel.lesson16.taxipark.TaxiPark;

import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;

public class FileCarsStorage implements CarsStorage {

    private String inputFileName;
    private String outputFileName;

    public FileCarsStorage(String inputFileName, String outputFileName) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
    }

    public FileCarsStorage(String inputFileName) {
        this(inputFileName, inputFileName);
    }

    public Car[] readCars() {
        try (FileInputStream fis = new FileInputStream(inputFileName)) {
            String fileString = createStringFromFile(fis).replaceAll("\\s+", "");

            System.out.println(fileString);

            String[] carStrings = fileString.split(";");

            return createCarObjectFromStrings(carStrings);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return new Car[0];
    }

    public void writeCars(Car[] arrayOfCars) {
        try (FileOutputStream fos = new FileOutputStream(outputFileName)) {
            StringJoiner sj = new StringJoiner(";" + System.lineSeparator());
            for (Car car : arrayOfCars) {
                sj.add(car.toFileFormat());
            }
            fos.write(sj.toString().getBytes());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private String createStringFromFile(FileInputStream fis) throws IOException {

        byte[] fileBytes = new byte[fis.available()];
        fis.read(fileBytes);
        return new String(fileBytes);
    }

    private Car[] createCarObjectFromStrings(String[] carString) {
        Car[] listOfCars = new CarImpl[carString.length];

        for (int i = 0; i < carString.length; i++) {
            String[] carProperties = carString[i].split(",");

            switch (carProperties[0]) {
                case ("ElectricCar"):
                    listOfCars[i] = new ElectricCar(carProperties);
                    break;
                case ("DieselCar"):
                    listOfCars[i] = new DieselCar(carProperties);
                    break;
                case ("PetrolCar"):
                    listOfCars[i] = new PetrolCar(carProperties);
                    break;
            }
        }
        return listOfCars;
    }
}