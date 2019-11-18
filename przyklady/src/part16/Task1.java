package part16;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class Task1 {

	public static void main(String[] args) {
		System.out.println(Instant.now());
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(OffsetDateTime.now());
		System.out.println(ZonedDateTime.now());
	}
}
