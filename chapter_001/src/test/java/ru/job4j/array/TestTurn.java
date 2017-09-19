package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestTurn{
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int [] massiv = {2, 6, 1, 4};
        Turn rev = new Turn();
        int[] rezult = rev.back(massiv);
        assertThat(rezult, is(new int[] {4, 1, 6, 2}));
    }

}
