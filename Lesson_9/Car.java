package Lesson_9;

public class Car {
    int id;
    String brand;
    String model;
    int year;
    String color;
    int price;
    int registerNumber;

    public Car(int id, String brand, String model, int year, String color, int price, int registerNumber) {

        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registerNumber = registerNumber;
    }

     int workingYears (){
        return 2019 - year;
     }
}
