package Lesson12;

public class TaxiParkRunner {
    public static void main(String[] args) {

        Car[] listOfCars = new Car[]{
                new ElectricCar("electric", "NISSAN", "Leaf", "WHITE", 12345, 15000, 145, 15, 8),
                new ElectricCar("electric", "TESLA", "S", "BLACK", 12346, 40000, 193, 23.8, 8),
                new ElectricCar("electric", "BMW", "i3", "RED", 12347, 22000, 150, 12, 8),
                new DieselCar("diesel", "RENAULT", "Sandero", "BLUE", 12348, 13200, 158, 3.9, 50, 6),
                new DieselCar("diesel", "KIA", "Sportage", "WHITE", 12349, 25000, 177, 4.7, 58, 6),
                new DieselCar("diesel", "CITROEN", "C-Eiysee", "BLUE", 12350, 18000, 160, 3.9, 50, 4),
                new PetrolCar("petrol", "BMW", "X1", "BLACK", 12351, 30000, 201, 8.4, 63, 95),
                new PetrolCar("petrol", "DAEWOO", "Lanos", "GREEN", 12352, 10000, 155, 7.2, 48, 92),
                new PetrolCar("petrol", "CITROEN", "C4", "ORANGE", 12353, 20000, 181, 7.1, 60, 95)
        };

        TaxiPark taxiPark = new TaxiPark(listOfCars);

        System.out.println("The cost of Taxi park is: " + taxiPark.costOfCars() + "$");
        System.out.println();

        System.out.println("Cars sorted by consumption:");
        Car[] carsSortedByConsumption = taxiPark.sortByConsumption();
        taxiPark.printCar(carsSortedByConsumption);

        System.out.println("Cars by speed:");
        Car[] carsBySpeed = taxiPark.findCarsBySpeed(0, 160);
        taxiPark.printCar(carsBySpeed);

    }


}
