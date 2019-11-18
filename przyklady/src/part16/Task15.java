package part16;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Task15 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2019, Month.OCTOBER, 27);
		LocalTime time = LocalTime.of(2, 30);
		ZoneId zone = ZoneId.of("Europe/Warsaw");
		ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);
		System.out.println(dateTime);
		dateTime = dateTime.plusHours(1);
		System.out.println(dateTime);
	}
}
