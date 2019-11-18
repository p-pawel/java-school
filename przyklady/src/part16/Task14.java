package part16;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Task14 {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.of(2019, Month.OCTOBER, 26);
		LocalTime time1 = LocalTime.of(9, 0);
		ZoneId zone1 = ZoneId.of("Europe/Warsaw");
		ZonedDateTime dateTime1 = ZonedDateTime.of(date1, time1, zone1);

		LocalDate date2 = LocalDate.of(2019, Month.OCTOBER, 27);
		LocalTime time2 = LocalTime.of(9, 0);
		ZoneId zone2 = ZoneId.of("Europe/Warsaw");
		ZonedDateTime dateTime2 = ZonedDateTime.of(date2, time2, zone2);


		ChronoUnit hours = ChronoUnit.HOURS;
		long diff = hours.between(dateTime1, dateTime2);
		System.out.println(diff);
	}
}
