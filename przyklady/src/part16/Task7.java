package part16;

import java.time.LocalDate;
import java.time.Period;

public class Task7 {

	public static final Period PERIOD = Period.ofDays(29);

	public static void main(String[] args) {

		LocalDate lastFullMoon = LocalDate.of(2019, 11, 12);

		for (int i = 0; i < 5; i++) {
			System.out.println(lastFullMoon.plus(PERIOD.multipliedBy(i + 1)));
		}


	}
}