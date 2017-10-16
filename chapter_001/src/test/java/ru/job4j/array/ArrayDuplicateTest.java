package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate rem = new ArrayDuplicate();
        String [] massiv = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String [] rezult = rem.remove(massiv);
        assertThat(rezult, is(new String [] {"Привет", "Мир", "Супер"}));
    }
}