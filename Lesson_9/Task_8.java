package Lesson_9;

public class Task_8 {
    public static class Processor {

        public static void printObjects(Car[] resultListOfCars) {
            for (int i = 0; i < resultListOfCars.length; i++) {
                if (resultListOfCars [i] != null){
                    System.out.printf("%-5s", String.valueOf(resultListOfCars[i].getId()));
                    System.out.printf("%-10s", String.valueOf(resultListOfCars[i].getBrand()));
                    System.out.printf("%-10s", String.valueOf(resultListOfCars[i].getModel()));
                    System.out.printf("%-10s", String.valueOf(resultListOfCars[i].getYear()));
                    System.out.printf("%-10s", String.valueOf(resultListOfCars[i].getPrice()));
                    System.out.printf("%-10s", String.valueOf(resultListOfCars[i].getPrice()));
                    System.out.printf("%-10s", String.valueOf(resultListOfCars[i].getRegisterNumber()));
                    System.out.println();
                }
            }
        }

        public static void findBrand(Car[] listOfCars, String brandToFind) {
            Car[] newCar = new Car[10];
            int j = 0;
            System.out.println("Список  автомобилей марки " + brandToFind + ":");

            for (int i = 0; i < listOfCars.length; i++, j++) {
                if (listOfCars[i].getBrand().equals(brandToFind)) {
                    newCar[j] = listOfCars[i];
                }
                else  {
                    j--;
                }
            }
            printObjects(newCar);
            System.out.println();
            }


        public static void findCarsByModelAndTerm(Car[] listOfCars, String model, int yearTill, int years) {
            Car[] newCar2 = new Car[10];
            System.out.println("Список моделей автомобилей которые эксплуатируются больше " + years + " лет:");
            int j = 0;

            for (int i = 0; i < listOfCars.length; i++, j++) {
                if (listOfCars[i].getModel().equals(model) & yearTill - listOfCars[i].getYear() > years) {
                    newCar2[j] = listOfCars[i];
                }
                else {
                    j--;
                }
            }
            printObjects(newCar2);
            System.out.println();
        }

        public static void findCarsByYearAndPrice(Car[] listOfCars,  int yearToFind, int price ) {
            Car[] newCar3 = new Car[10];
            System.out.println("Список автомобилей " + yearToFind + " года выпуска, цена которых больше " + price);
            int j = 0;

            for (int i = 0; i < listOfCars.length; i++, j++) {
                if (listOfCars[i].getYear() == yearToFind & listOfCars[i].getPrice() > price) {
                    newCar3[j] = listOfCars[i];
                }
                else {
                    j--;
                }
            }

            printObjects(newCar3);
            System.out.println();
        }
    }

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

        Processor.findBrand(listOfCars, "BMW");

        Processor.findCarsByModelAndTerm(listOfCars, "LX", 2019, 6);

        Processor.findCarsByYearAndPrice(listOfCars, 1984, 50000);

    }
}

    class Car {
        int id;
        String brand;
        String model;
        int year;
        String color;
        int price;
        int registerNumber;

        Car (int id, String brand, String model, int year, String color, int price, int registerNumber) {

            this.id = id;
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.color = color;
            this.price = price;
            this.registerNumber = registerNumber;
        }

        public int getId() {
            return id;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }

        public int getPrice() {
            return price;
        }

        public int getRegisterNumber() {
            return registerNumber;
        }

    }


