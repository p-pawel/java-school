package part16;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Task11 {

	public static void main(String[] args) {
		System.out.println(ZonedDateTime.now(ZoneId.of("Europe/London")));
		System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Tokyo")));
	}
}