package programator.katowice.tdd;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class ShoppingSundayTest {

	@Test
	void test() {

		// given
		ShoppingSunday shoppingSunday = new ShoppingSunday();
		LocalDate localDate = LocalDate.of(2019, 11, 24);

		// when
		boolean result = shoppingSunday.isSundayShopping(localDate);

		// then
		assertThat(result).isTrue();
	}
}
