package part16;

import java.time.LocalDateTime;

public class Task6 {

	public static final int MINUTE_INTERVAL = 24 * 60 / 5;

	public static void main(String[] args) {

		LocalDateTime firstFeedingTime = LocalDateTime.of(2019, 11, 16, 13, 0);

		for (int i = 0; i < 50; i++) {
			System.out.println(firstFeedingTime.plusMinutes(MINUTE_INTERVAL * i));
		}


	}
}