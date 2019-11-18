package part16;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjusters;

public class Task13 {

	public static void main(String[] args) {


		ZoneId zoneAsia = ZoneId.of("Asia/Kolkata");
		ZoneId zonePL = ZoneId.of("Europe/Warsaw");

		ZonedDateTime theirTime = ZonedDateTime.now(zoneAsia)
				.with(TemporalAdjusters.next(DayOfWeek.MONDAY))
				.withHour(10).withMinute(0);

		System.out.println(theirTime);
		Instant utcTime = theirTime.toInstant();
		System.out.println(utcTime);

		LocalDateTime ourTime = LocalDateTime.ofInstant(utcTime, zonePL);
		ZonedDateTime ourTimeZ1 = ZonedDateTime.ofInstant(utcTime, zonePL);
		System.out.println(ourTime);
		System.out.println(ourTimeZ1);

		ZonedDateTime ourTimeZ2 = theirTime.withZoneSameInstant(zonePL);
		System.out.println(ourTimeZ2);


	}
}