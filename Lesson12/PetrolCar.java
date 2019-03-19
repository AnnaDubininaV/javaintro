package Lesson12;

public class PetrolCar extends FuelCar {
    int gasolineGrade;

    PetrolCar(String typeOfEngine, String brand, String model, String color, int registerNumber, int price, int maxSpeed,
              double consumption, int tankCapacity, int gasolineGrade) {

        super(typeOfEngine, brand, model, color, registerNumber, price, maxSpeed, consumption, tankCapacity);
        this.gasolineGrade = gasolineGrade;
    }

    public String toString() {
        return super.toString();
    }
}
