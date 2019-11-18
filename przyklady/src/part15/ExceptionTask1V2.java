package part15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExceptionTask1V2 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		/*
			można też tak:

			List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

			- ale to może sprawić, że zamiast ogólnego IndexOutOfBoundsException wystąpi błąd ArrayIndexOutOfBoundsException
		 */


		for (int i = 0; i < 10; i++) {
			Random random = new Random();
			int index = random.nextInt(11);
			try {
				System.out.println(list.get(index));
			} catch (IndexOutOfBoundsException e) {
				System.out.println(e.getClass());
				System.out.println(0);
			}
		}
	}
}
