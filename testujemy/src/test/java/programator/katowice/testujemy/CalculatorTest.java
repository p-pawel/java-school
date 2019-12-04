package programator.katowice.testujemy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

	Calculator calculator = new Calculator();

	@Test
	void add00() {
		assertEquals(0, calculator.add(0, 0));
	}

	@Test
	void add10() {
		assertEquals(1, calculator.add(1, 0));
	}

	@Test
	void add20() {
		assertEquals(2, calculator.add(2, 0));
	}

	@Test
	void add11() {
		assertEquals(2, calculator.add(1, 1));
	}
}