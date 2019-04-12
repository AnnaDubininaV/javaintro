package com.hillel.lesson16.exception;

public class CarSearchException extends Exception {

    private int min;
    private int max;

    public CarSearchException(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public String toString() {
        return "CarSearchException [" + min + "," + max + "]";
    }

}
