package ru.job4j.loop;


public class Factorial {

    public int calc(int n) {
        int value = 1;
        for (n=1; n <= 5; n++) {
            value = value*n;
        }
        return value;
    }
}
