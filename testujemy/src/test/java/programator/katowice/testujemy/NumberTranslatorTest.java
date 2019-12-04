package programator.katowice.testujemy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


class NumberTranslatorTest {

	@Test
	void translate() {

		NumberTranslator numberTranslator = new NumberTranslator();

		assertEquals("zero", numberTranslator.translate(0));
		assertEquals("jeden", numberTranslator.translate(1));
		assertEquals("dwa", numberTranslator.translate(2));
		assertEquals("trzy", numberTranslator.translate(3));
		assertEquals("cztery", numberTranslator.translate(4));
		assertEquals("pięć", numberTranslator.translate(5));
		assertEquals("sześć", numberTranslator.translate(6));
		assertEquals("siedem", numberTranslator.translate(7));
		assertEquals("osiem", numberTranslator.translate(8));
		assertEquals("dziewięć", numberTranslator.translate(9));
		assertEquals("dziesięć", numberTranslator.translate(10));
	}

	@ParameterizedTest
	@CsvFileSource(resources = "/numbers.csv", encoding = "UTF-8")
	void testFromFile(int input, String expected) {
		NumberTranslator numberTranslator = new NumberTranslator();

		String actual = numberTranslator.translate(input);

		assertEquals(expected, actual);



		assertThat(actual).isEqualTo(expected);

	}


	@Test
	void testSize() {

		List<Integer> list = new ArrayList<>();
		list.add(100);

		assertWhatever(list);
	}

	private void assertWhatever(List<Integer> list) {
		assertThat(list).hasSize(1);
		assertThat(list).contains(100, 200, 300);

		assertEquals(0, list.size());
	}

}