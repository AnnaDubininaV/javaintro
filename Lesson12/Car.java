package Lesson12;

abstract class Car {

    String typeOfEngine;
    String brand;
    String model;
    String color;
    int registerNumber;
    int price;
    int maxSpeed;
    double consumption;

    Car (String typeOfEngine, String brand, String model, String color, int registerNumber, int price, int maxSpeed, double consumption) {
        this.typeOfEngine = typeOfEngine;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registerNumber = registerNumber;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.consumption = consumption;
    }

    public String toString() {

        return "Type of engine: " + this.typeOfEngine + "; Mark: " + this.brand + "; model: " + this.model + "; color: "
                + this.color + "; register number: " + this.registerNumber + "; price: " + this.price + "; max speed: "
                + this.maxSpeed + "; consumption: " + this.consumption;
    }


}
