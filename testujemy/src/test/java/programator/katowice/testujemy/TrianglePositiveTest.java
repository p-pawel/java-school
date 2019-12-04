package programator.katowice.testujemy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianglePositiveTest {

	@Test
	void shouldTriangleConstructionFailWhenSizeNotPositive() {
		assertDoesNotThrow(() -> new Triangle(1, 1, 1) );
		assertThrows(NotPositiveLenghtInTriangleException.class, () -> new Triangle(0, 1, 1) );
		assertThrows(NotPositiveLenghtInTriangleException.class, () -> new Triangle(-1, 1, 2) );
	}
}