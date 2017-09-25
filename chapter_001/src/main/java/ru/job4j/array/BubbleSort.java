package ru.job4j.array;

public class BubbleSort {
    public int[] sort(int[] array){
        int arr = array.length;
        int temp = 0;

        for (int i = 0; i<arr; i++){
            for (int b = 1; b<(arr-i); b++ ){
                if (array[b-1]>array[b]){
                    temp = array[b-1];
                    array[b-1] = array[b];
                    array[b] = temp;

                }
            }
        }
        return array;
    }
}
