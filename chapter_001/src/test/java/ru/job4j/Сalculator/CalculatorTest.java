import ru.job4j.Calculator;

import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.subtract(1D, 1D);
        calc.div(1D, 1D);
        calc.multiple(1D, 1D);
        calc.add(1D, 1D);
        double result = calc.getRezult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
}
