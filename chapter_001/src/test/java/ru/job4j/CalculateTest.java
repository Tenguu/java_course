package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Vladimir Mailyanc (seo@kts.by)
* @since 27.07.2017 f
* @version $0.01$
*/
public class CalculateTest {
/**
* Test add.
*/
@Test
public void whenAddOneToOneThenTwo() {
ByteArrayOutputStream out = new ByteArrayOutputStream();
System.setOut(new PrintStream(out));
Calculate.main(null);
assertThat(out.toString(), is(String.format("Hello World%s", System.getProperty("line.separator"))));
}
}