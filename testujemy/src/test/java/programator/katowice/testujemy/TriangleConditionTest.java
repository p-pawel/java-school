package programator.katowice.testujemy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TriangleConditionTest {

	@Test
	void shouldTriangleConstructionFailWhenTriangleNotValid() {

//		assertThrows(NotPositiveLenghtInTriangleException.class, () -> new Triangle(-1, 1, 2) );
		assertThrows(TriangleConditionException.class, () -> new Triangle(1, 1, 2) );

	}
}