package Lesson12;

public class TaxiPark {
    Car[] taxiPark;

    TaxiPark(Car[] taxiPark) {
        this.taxiPark = taxiPark;
    }

    int costOfCars() {
        int carParkCost = 0;

        for (int i = 0; i < this.taxiPark.length; i++) {
            carParkCost += this.taxiPark[i].price;
        }
        return carParkCost;
    }

    Car[] sortByConsumption() {

        for (int i = taxiPark.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (taxiPark[j].consumption > taxiPark[j + 1].consumption) {

                    Car temp = taxiPark[j];
                    taxiPark[j] = taxiPark[j + 1];
                    taxiPark[j + 1] = temp;
                }
            }
        }
        return taxiPark;
    }


    Car[] findCarsBySpeed(int minSpeed, int maxSpeed) {
        Car[] carsBySpeed = new Car[this.taxiPark.length];
        int j = 0;

        for (int i = 0; i < this.taxiPark.length; i++) {
            if (this.taxiPark[i].maxSpeed <= maxSpeed & this.taxiPark[i].maxSpeed >= minSpeed) {
                carsBySpeed[j] = taxiPark[i];
                j++;
            }
        }

        Car[] carsBySpeed2 = new Car[j];

        for (int k = 0, f = 0; k < carsBySpeed.length; k++) {
            if (carsBySpeed[k] != null) {
                carsBySpeed2[f] = carsBySpeed[k];
                f++;
            }
        }
        return carsBySpeed2;
    }

    public void printCar(Car[] car) {

        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i].toString());
        }
        System.out.println();
    }
}
