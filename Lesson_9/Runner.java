package Lesson_9;

import java.lang.reflect.Array;

public class Runner {
    public static void main(String[] args) {

        Car[] listOfCars = new Car[]{
                new Car(1, "BMW", "1M", 2017, "RED", 500000, 2222),
                new Car(2, "BMW", "315", 1984, "BLACK", 600000, 2223),
                new Car(3, "BMW", "3-Series", 2000, "BLACK", 100000, 2224),
                new Car(4, "Lada", "2107", 1984, "WHITE", 30000, 2225),
                new Car(5, "Lada", "Vesta SW", 2017, "YELLOW", 180000, 2226),
                new Car(6, "Lada", "2107", 1984, "PINK", 25000, 2227),
                new Car(7, "Lexus", "LX", 2001, "WHITE", 450000, 2228),
                new Car(8, "Lexus", "LX", 2014, "BLACK", 580000, 2229),
                new Car(9, "Lexus", "LX", 1996, "RED", 237000, 2230)
        };

        CarProcessor processor = new CarProcessor();

        processor.findBrand( listOfCars,"BMW");
        processor.findCarsByModelAndTerm(listOfCars, "LX", 6);
        processor.findCarsByYearAndPrice(listOfCars, 1984, 50000);

        CarProcessor processor1 = new CarProcessor(listOfCars);

        processor1.findBrand("Lada");
        processor1.findCarsByModelAndTerm("2107", 10);
        processor1.findCarsByYearAndPrice(2017, 200000);
    }
}