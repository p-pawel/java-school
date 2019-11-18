package part16;

import java.time.LocalDate;
import java.time.Month;

public class Task3 {

	public static void main(String[] args) {

		LocalDate issueDate = LocalDate.of(2019, Month.OCTOBER, 31);

		LocalDate dueDate = issueDate.plusDays(21);

		System.out.println(dueDate);
	}
}