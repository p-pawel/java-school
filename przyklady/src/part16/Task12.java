package part16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Task12 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2019, 12, 12);
		LocalTime time = LocalTime.of(6, 14);
		LocalDateTime localDateTime = LocalDateTime.of(date, time);


		ZoneId zone = ZoneId.of("Europe/Moscow");
		System.out.println(localDateTime.atZone(zone));
	}
}