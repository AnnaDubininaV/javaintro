package Lesson12;

public class DieselCar extends FuelCar {
    int glowPlug;

    DieselCar(String typeOfEngine, String brand, String model, String color, int registerNumber, int price, int maxSpeed,
              double consumption, int tankCapacity, int glowPlug) {

        super(typeOfEngine, brand, model, color, registerNumber, price, maxSpeed, consumption, tankCapacity);
        this.glowPlug = glowPlug;
    }

    public String toString() {
        return super.toString();
    }

}
