package testpackage;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator obj = new Calculator();
		int expected=13;
		int actual=obj.add(10, 3);
		Assertions.assertEquals(expected,actual);
	}

}
