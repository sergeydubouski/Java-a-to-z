package ru.job4j.shapes;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Sergey Dubouski
 * @version $id$
 * @since 14.04.2017
*/
public class PaintTest {

	/**
	 * Test.
	*/
	@Test
	public void whenCallDrawMethodThenSquareIsDisplayed() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
		new Paint().draw(new Square());
		assertThat(out.toString(), is(String.format("******%s******%s******%s******%s", System.getProperty("line.separator"), System.getProperty("line.separator"), System.getProperty("line.separator"), System.getProperty("line.separator"))));
	}
	/**
	 * Test.
	*/
	@Test
	public void whenCallDrawMethodThenTriangleIsDisplayed() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
		new Paint().draw(new Triangle());
		assertThat(out.toString(), is(String.format("%4s*%s %2s*%1s*%s %1s*%3s*%s *******%s", " ", System.getProperty("line.separator"), " ", " ", System.getProperty("line.separator"), " ", " ", System.getProperty("line.separator"), System.getProperty("line.separator"))));
	}
}