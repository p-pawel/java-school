package programator.katowice.testujemy;

public class TestsApp {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();

		System.out.println(calculator.add(0, 0) == 0);
		System.out.println(calculator.add(1, 0) == 1);
		System.out.println(calculator.add(2, 0) == 2);
		System.out.println(calculator.add(1, 1) == 2);
	}
}
