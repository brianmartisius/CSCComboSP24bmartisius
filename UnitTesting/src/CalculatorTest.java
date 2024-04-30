
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class CalculatorTest {
	
	private Calculator calc;
	
	@BeforeEach
	public void setup() {
		calc = new Calculator();
	}
	
	@Test
	public void testAdd() {
		int ans = calc.add(2, 3);
		assertEquals(5, ans, "Add 2 and 3 does not work");
	}
	@Test
	public void testMultiply() {
		int mul = calc.multiply(2, 3);
		assertTrue(mul == 6, "Multiply of 2 and 3 does not work");
		
	}
	@Test
	@Disabled("Code not implemented yet")
	public void testDivide() {
		double div = calc.divide(2, 3);
		assertEquals(0.66666, div, "Divide of 2 and 3 does not work");
	}

}
