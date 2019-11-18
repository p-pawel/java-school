package part16;

import java.time.Duration;
import java.time.LocalDateTime;

public class Task8 {

	public static final int MINUTE_INTERVAL_CAT = 24 * 60 / 5;
	public static final int MINUTE_INTERVAL_DOG = 24 * 60 / 2;

	public static void main(String[] args) {

		LocalDateTime firstFeedingTime = LocalDateTime.of(2019, 11, 16, 6, 0);

		Duration catDuration = Duration.ofMinutes(MINUTE_INTERVAL_CAT);
		Duration dogDuration = Duration.ofMinutes(MINUTE_INTERVAL_DOG);
		nextFeedings("Cat", firstFeedingTime, 10, catDuration);
		nextFeedings("Dog", firstFeedingTime, 10, dogDuration);
	}

	private static void nextFeedings(String name, LocalDateTime firstFeedingTime, int number, Duration duration) {
		for (int i = 0; i < number; i++) {
			System.out.println(name + " " + firstFeedingTime.plus(duration.multipliedBy(i)));
		}
	}
}