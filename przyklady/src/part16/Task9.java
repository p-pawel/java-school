package part16;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Task9 {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(1996, 1, 23);
		LocalDate date2 = LocalDate.of(2019, 9, 14);

		long number = ChronoUnit.MONTHS.between(date1, date2);
		System.out.println(number);
	}
}