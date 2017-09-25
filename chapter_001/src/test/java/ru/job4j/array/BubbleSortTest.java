package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        int [] massiv = {5, 1, 2, 7, 3};
        BubbleSort buble = new BubbleSort();
        int[] rezult = buble.sort(massiv);
        assertThat(rezult, is(new int[] {1, 2, 3, 5, 7}));
    }
}