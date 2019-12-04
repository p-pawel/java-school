package programator.katowice.testujemy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class StringLengthTest {

	@ParameterizedTest
	@CsvFileSource(resources = "/countries.csv", numLinesToSkip = 1)
	void testLength(String name, int expectedLength) {
		Assertions.assertEquals(expectedLength, StringLength.length(name));
	}

}
