package part15;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo3 {

	public static void main(String[] args) {

		try {

//			Class c2 = Class.forName("workshop.ExceptionsDemo3");
		 	Class c2 = Class.forName("zla nazwa klasy"); // <- to wyrzuci wyjątek ClassNotFoundException

			System.out.println("Dzień dobry. ");
			FileReader fileReader = new FileReader("aaaa");
			System.out.println("Do widzenia. ");
		} catch (FileNotFoundException e) {
			System.out.println("Wystąpił błąd w dostępie do pliku.");
		} catch (ClassNotFoundException e) {
			System.out.println("Wystąpił błąd w dostępie do klasy.");
		}

	}
}
