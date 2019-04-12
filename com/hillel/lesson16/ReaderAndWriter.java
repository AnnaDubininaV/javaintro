package com.hillel.lesson16;

import com.hillel.lesson16.car.impl.CarImpl;
import com.hillel.lesson16.car.impl.DieselCar;
import com.hillel.lesson16.car.impl.ElectricCar;
import com.hillel.lesson16.car.impl.PetrolCar;
import com.hillel.lesson16.taxipark.TaxiPark;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class ReaderAndWriter {

    public static CarImpl[] createListOfCars(String fileToRead) throws IOException {
        String stringOfCars = fileToString(fileToRead).trim().replace(" ", "");
        String[][] arrayOfCars = stringToArray(stringOfCars);
        return createObjectFromArray(arrayOfCars);
    }

    private static String fileToString(String fileName) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        byte[] fileBytes = new byte[fis.available()];
        String w = "";
        int data = fis.read();

        while (fis.read() != -1) {
            for (int i = 0; i < fileBytes.length - 2; i++) {
                fileBytes[i] = (byte) fis.read();
                if (fileBytes[i] == (byte) 13 | fileBytes[i] == (byte) 10 | fileBytes[i] == 0) {
                    continue;
                }
                w += (char) fileBytes[i];
            }
            System.out.println(w);
        }
        return w;
    }

/////////////  так не получается /////////////////////////////

//    private static String fileToString(String fileName) throws IOException {
//        FileInputStream fis = new FileInputStream(fileName);
//        byte[] fileBytes = new byte[fis.available()];
//        fis.read(fileBytes);
//        System.out.println(new String(fileBytes));
//        return new String(fileBytes);
//
//    }

    private static String[][] stringToArray(String string) {
        String[] arrayOfCars = string.split(";");
        String[][] carOptions = new String[arrayOfCars.length][];

        for (int i = 0; i < arrayOfCars.length; i++) {
            carOptions[i] = arrayOfCars[i].split(",");
        }
        return carOptions;
    }

    private static CarImpl[] createObjectFromArray(String[][] carOptions) {
        CarImpl[] listOfCars = new CarImpl[carOptions.length];

        for (int i = 0; i < carOptions.length; ++i) {
            if (carOptions[i][0].equals("ElectricCar")) {
                ElectricCar elCar = new ElectricCar(carOptions[i][1], carOptions[i][2], carOptions[i][3],
                        Integer.parseInt(carOptions[i][4]), Integer.parseInt(carOptions[i][5]),
                        Integer.parseInt(carOptions[i][6]), Double.parseDouble(carOptions[i][7]), Integer.parseInt(carOptions[i][8]));
                listOfCars[i] = elCar;
            } else if (carOptions[i][0].equals("DieselCar")) {
                DieselCar disCar = new DieselCar(carOptions[i][1], carOptions[i][2], carOptions[i][3], Integer.parseInt(carOptions[i][4]),
                        Integer.parseInt(carOptions[i][5]), Integer.parseInt(carOptions[i][6]), Double.parseDouble(carOptions[i][7]),
                        Integer.parseInt(carOptions[i][8]), Integer.parseInt(carOptions[i][9]));
                listOfCars[i] = disCar;
            } else {
                PetrolCar petCar = new PetrolCar(carOptions[i][1], carOptions[i][2], carOptions[i][3], Integer.parseInt(carOptions[i][4]),
                        Integer.parseInt(carOptions[i][5]), Integer.parseInt(carOptions[i][6]), Double.parseDouble(carOptions[i][7]),
                        Integer.parseInt(carOptions[i][8]), Integer.parseInt(carOptions[i][9]));
                listOfCars[i] = petCar;
            }
        }
        return listOfCars;
    }

    public static void printCarToFile(CarImpl[] listOfCars, String pathName) {
        try (PrintStream stream = new PrintStream(new File(pathName))) {
            for (int i = 0; i < listOfCars.length; i++) {
                if (listOfCars[i].getClass().equals(ElectricCar.class)) {
                    stream.println("ElectricCar [" + "mark: " + listOfCars[i].getBrand() + "; model: " + listOfCars[i].getModel() + "; color: "
                            + listOfCars[i].getColor() + "; register number: " + listOfCars[i].getRegisterNumber() + "; price: " + listOfCars[i].getPrice() + "; max speed: "
                            + listOfCars[i].getMaxSpeed() + "; consumption: " + listOfCars[i].getConsumption() + "; battery charge time: " + ElectricCar.getBatteryChargeTime() + "]");
                }
                if (listOfCars[i].getClass().equals(DieselCar.class)) {
                    stream.println("DieselCar [" + "mark: " + listOfCars[i].getBrand() + "; model: " + listOfCars[i].getModel() + "; color: "
                            + listOfCars[i].getColor() + "; register number: " + listOfCars[i].getRegisterNumber() + "; price: " + listOfCars[i].getPrice() + "; max speed: "
                            + listOfCars[i].getMaxSpeed() + "; consumption: " + listOfCars[i].getConsumption() + "; tankCapacity: " + DieselCar.getTankCapacity() + "; glow plug: " + DieselCar.getGlowPlug() + "]");
                }
                if (listOfCars[i].getClass().equals(PetrolCar.class)) {
                    stream.println("PetrolCar [" + "mark: " + listOfCars[i].getBrand() + "; model: " + listOfCars[i].getModel() + "; color: "
                            + listOfCars[i].getColor() + "; register number: " + listOfCars[i].getRegisterNumber() + "; price: " + listOfCars[i].getPrice() + "; max speed: "
                            + listOfCars[i].getMaxSpeed() + "; consumption: " + listOfCars[i].getConsumption() + "; tankCapacity: " + PetrolCar.getTankCapacity() + "; gasolineGrade: " + PetrolCar.getGasolineGrade() + "]");
                }
            }
        } catch (IOException ex) {
            System.out.println("Exception!!!");
        }
    }

    public static void printCarToFile(TaxiPark taxiPark, String pathName) {
        try (PrintStream stream = new PrintStream(new File(pathName))) {
            stream.println(taxiPark.toString());
        } catch (IOException ex) {
            System.out.println("Exception!!!");
        }
    }

}