package Lesson_9;

public class CarProcessor {
    Car[] arrayOfCars;

    public CarProcessor(Car[] listOfCars) {
        this.arrayOfCars = listOfCars;
    }

    public CarProcessor() {
        this.arrayOfCars = null;
    }

    public void findBrand(Car[] listOfCars, String brandToFind) {
        System.out.println("Список  автомобилей марки " + brandToFind + ":");

        for (int i = 0; i < listOfCars.length; i++) {
            if (listOfCars[i].brand.equals(brandToFind)) {
                printCar(listOfCars[i]);
            }
        }
        System.out.println();
    }

    public void findBrand(String brandToFind) {
        if (arrayOfCars != null) {
            findBrand(this.arrayOfCars, brandToFind);
        }
    }

    public void findCarsByModelAndTerm(Car[] listOfCars, String model, int years) {
        System.out.println("Список моделей автомобилей которые эксплуатируются больше " + years + " лет:");

        for (int i = 0; i < listOfCars.length; i++) {
            if (listOfCars[i].model.equals(model) & listOfCars[i].workingYears() > years) {
                printCar(listOfCars[i]);
            }
        }
        System.out.println();
    }

    public void findCarsByModelAndTerm(String model, int years) {
        if (arrayOfCars != null) {
            findCarsByModelAndTerm(this.arrayOfCars, model, years);
        }
    }

    public void findCarsByYearAndPrice(Car[] listOfCars, int yearToFind, int price) {
        System.out.println("Список автомобилей " + yearToFind + " года выпуска, цена которых больше " + price);

        for (int i = 0; i < listOfCars.length; i++) {
            if (listOfCars[i].year == yearToFind & listOfCars[i].price > price) {
                printCar(listOfCars[i]);
            }
        }
        System.out.println();
    }

    public void findCarsByYearAndPrice(int yearToFind, int price) {
        if (arrayOfCars != null) {
            findCarsByYearAndPrice(this.arrayOfCars, yearToFind, price);
        }
    }

    public static void printCar(Car car) {
        System.out.print("id: " + car.id + "; mark: " + car.brand + "; model: " + car.model + "; year: " + car.year);
        System.out.print("; color: " + car.color + "; price: " + car.price + "; register number: " + car.registerNumber);
        System.out.println();
    }
}
