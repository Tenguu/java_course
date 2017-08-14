package ru.job4j;

public class Calculator {

    private double rezult;

    public void add(double first, double second) {
        this.rezult = first + second;
      }

    public double getRezult(){
        return this.rezult;
    }

}
