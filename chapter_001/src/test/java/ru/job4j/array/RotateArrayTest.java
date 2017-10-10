
package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

    public class RotateArrayTest {
        @Test
        public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
            int [][] massiv2 = {{1, 2, 3,},
                               {4, 5, 6,},
                               {7, 8, 9,}};
            RotateArray rote = new RotateArray();
            int[][] rezult = rote.rotate(massiv2);
            assertThat(rezult, is(new int[][] {{7, 4, 1},
                                               {8, 5, 2},
                                               {9, 6, 3}}));
        }

       // @Test
        //public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
            //напишите здесь тест, проверяющий поворот массива размером 3 на 3.
        //}
    }

