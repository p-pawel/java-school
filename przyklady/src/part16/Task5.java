package part16;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task5 {

	public static void main(String[] args) {



		List<Integer> list1 = new ArrayList<>();
		for (int i=0; i<10; i++) {
			list1.add(LocalDate.of(2019, 12, 4).plusYears(i).getDayOfWeek().getValue());
		}

		List<Integer> list2 = IntStream.range(0, 10)
				.mapToObj(y -> LocalDate.of(2019 + y, 12, 4))
				.map(LocalDate::getDayOfWeek)
				.map(DayOfWeek::getValue)
				.collect(Collectors.toList());

		System.out.println(list1);
		System.out.println(list2);
	}
}