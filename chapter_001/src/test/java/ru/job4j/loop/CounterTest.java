package ru.job4j.loop;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

    public class CounterTest {
        @Test
        public void whenSumEvenNumbersFromOneToTenThenThirty() {
            Counter count = new Counter();
            int value = count.add(1, 10);
            assertThat(value, is(30));
        }
    }

