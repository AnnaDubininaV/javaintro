package com.hillel.lesson19.storage.CarsStorageImpl;

import com.hillel.lesson19.car.Car;
import com.hillel.lesson19.car.impl.CarImpl;
import com.hillel.lesson19.car.impl.DieselCar;
import com.hillel.lesson19.car.impl.ElectricCar;
import com.hillel.lesson19.car.impl.PetrolCar;
import com.hillel.lesson19.storage.CarsStorage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

    public List<Car> readCars() {
        try (FileInputStream fis = new FileInputStream(inputFileName)) {

            String fileString = createStringFromFile(fis).replaceAll("\\s+", "");
            System.out.println(fileString);

            String[] carStrings = fileString.split(";");

            return createCarObjectFromStrings(carStrings);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return Collections.emptyList();
    }

    public void writeCars(List<Car> arrayOfCars) {
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

    private List<Car> createCarObjectFromStrings(String[] carString) {
        List<Car> listOfCars = new ArrayList<>();
        for (int i = 0; i < carString.length; i++) {
            String[] carProperties = carString[i].split(",");

            switch (carProperties[0]) {
                case ("ElectricCar"):
                    listOfCars.add(new ElectricCar(carProperties));
                    break;
                case ("DieselCar"):
                    listOfCars.add(new DieselCar(carProperties));
                    break;
                case ("PetrolCar"):
                    listOfCars.add(new PetrolCar(carProperties));
                    break;
            }
        }
        return listOfCars;
    }
}