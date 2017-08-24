package ru.job4j.loop;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Factorial fact = new Factorial();
        int value = fact.calc(1);
        assertThat(value, is(120));
    }
}

