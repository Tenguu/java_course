package ru.job4j.array;

public class ArrayDuplicate {

    public String[] remove (String[] array2) {
        String[] array = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        System.out.println(array);
        int dup = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - dup; j++) {
                System.out.println(array[i]);
                if (array[i].equals(array[j])) {

                    while (j != array.length - dup - 1
                            && array[array.length - dup - 1].equals(array[j])) {
                        dup++;
                    }
                    String tmp = array[array.length - dup - 1];
                    array[array.length - dup - 1] = array[j];
                    array[j] = tmp;
                    dup++;
                }
            }
        }
        return array;
    }
}