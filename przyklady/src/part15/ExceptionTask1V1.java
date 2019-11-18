package part15;

import java.util.Random;

public class ExceptionTask1V1 {

	public static void main(String[] args) {
		int[] array = new int[5];

		for (int i = 0; i < 5; i++) {
			array[i] = i + 1;
		}

		//		int[] array = {1, 2, 3, 4, 5};

		for (int i=0; i<10; i++ ) {
			Random random = new Random();
			int index = random.nextInt(11);
			try {
				System.out.println(array[index]);
			} catch (IndexOutOfBoundsException e) {
				System.out.println(0);
			}
		}
	}
}
