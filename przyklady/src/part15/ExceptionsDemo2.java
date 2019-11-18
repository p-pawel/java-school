package part15;

import java.io.FileReader;

public class ExceptionsDemo2 {

	public static void main(String[] args) {

		try {
			FileReader fileReader = new FileReader("plik.txt");
		} catch (Exception e) {
			System.out.println("Wystąpił błąd.");
		}

	}
}
