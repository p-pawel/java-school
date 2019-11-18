package part16;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Task2 {

	public static void main(String[] args) {

		System.out.println(Instant.ofEpochSecond((long) ((2020-1970)*365.25*24*3600)));
		System.out.println(LocalDate.of(2019, Month.NOVEMBER, 16));
		System.out.println(LocalTime.of(14, 10));
		System.out.println(LocalTime.of(14, 10, 25, 500_000_000));
		System.out.println(LocalDateTime.of(2019, Month.NOVEMBER, 16, 14, 11));
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		System.out.println(LocalDateTime.of(date, time));
		System.out.println(LocalDateTime.now());

		ZoneOffset offset = ZoneOffset.UTC;
		System.out.println(OffsetDateTime.of(date, time, offset));

		ZoneId zone = ZoneId.systemDefault();
		System.out.println(ZonedDateTime.of(date, time, zone));

		LocalTime localTime1 = LocalTime.of(14, 10);
		LocalTime localTime2 = LocalTime.of(16, 10);


	}
}