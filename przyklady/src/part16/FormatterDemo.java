package part16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatterDemo {

	/**
	 * https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
	 */
	public static void main(String[] args) {
		LocalDate date2 = LocalDate.of(2019, 9, 4);

		System.out.println(date2);
		// 14.09.2019

		System.out.println(date2.getDayOfMonth() + "." + date2.getMonth().getValue() + "." + date2.getYear());

		System.out.println(date2.format(DateTimeFormatter.ofPattern("dd.MM.yyyy E")));
		System.out.println(date2.format(DateTimeFormatter.ofPattern("dd.MM.yyyy EE", Locale.forLanguageTag("pl"))));
		System.out.println(date2.format(DateTimeFormatter.ofPattern("dd.MM.yyyy EEEE", new Locale("pl","PL"))));

		//    Y       week-based-year             year              1996; 96


		System.out.println(LocalDate.parse("2019-11-16").plusDays(45));
		System.out.println(LocalDate.parse("04.09.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")));

		System.out.println(LocalDate.parse("wtorek", DateTimeFormatter.ofPattern("EEEE", Locale.forLanguageTag("pl"))));

	}
}