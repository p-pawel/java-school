package part16;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task4 {

	public static void main(String[] args) {

		List<LocalDate> list1 = new ArrayList<>();
		for (int month = 1; month <= 12; month++) {
			list1.add(LocalDate.of(2019, month, 18).plusDays(25));
		}

		List<LocalDate> list2 = new ArrayList<>();
		LocalDate startDate = LocalDate.of(2019, 1, 18);
		for (int i=0; i<12; i++) {
			list2.add(startDate.plusMonths(i).plusDays(25));
		}

		List<LocalDate> list3 = IntStream.range(1, 13)
				.mapToObj(month -> LocalDate.of(2019, month, 18))
				.map(date -> date.plusDays(25))
				.collect(Collectors.toList());

		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
	}
}