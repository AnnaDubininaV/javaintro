package Lesson12;

public class TaxiPark {
    private Car[] taxiPark;

    TaxiPark(Car[] taxiPark) {
        this.taxiPark = taxiPark;
    }

    public int costOfCars() {
        int carParkCost = 0;

        for (Car car : taxiPark) {
            carParkCost += car.getPrice();
        }
        return carParkCost;
    }

    public void sortByConsumption() {

        for (int i = taxiPark.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (taxiPark[j].getConsumption() > taxiPark[j + 1].getConsumption()) {

                    Car temp = taxiPark[j];
                    taxiPark[j] = taxiPark[j + 1];
                    taxiPark[j + 1] = temp;
                }
            }
        }
    }

    Car[] findCarsBySpeed(int minSpeed, int maxSpeed) {
        Car[] carsBySpeed = null;

        for (Car car : taxiPark) {
            if (car.getMaxSpeed() <= maxSpeed & car.getMaxSpeed() >= minSpeed) {
                if (carsBySpeed == null) {
                    carsBySpeed = new Car[1];
                    carsBySpeed[0] = car;
                } else {
                    Car[] tempCars = new Car[carsBySpeed.length + 1];

                    for (int i = 0; i < carsBySpeed.length; i++) {
                        tempCars[i] = carsBySpeed[i];
                    }
                    tempCars[tempCars.length - 1] = car;
                    carsBySpeed = tempCars;
                }
            }
        }
        return carsBySpeed;
    }


    public String toString() {
        int i = 0;
        String ok = "";
        for (; i < taxiPark.length; i++) {
            ok += taxiPark[i].toString() + "\n";
        }
        return ok;
    }
}
