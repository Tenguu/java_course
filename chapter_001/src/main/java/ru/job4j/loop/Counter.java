package ru.job4j.loop;


public class Counter {

    public int add(int start, int finish) {
        int value = 0;
        for (start=1; start <= finish; start++) {
            if (start % 2 == 0) {
                value += start;
            }
        }
        return value;
        }
    }


