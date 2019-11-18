package part15;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo8 {

	public static void main(String[] args) {


		try {
			Class c1 = Class.forName("workshop.exceptions.ExceptionsDemo3");

//			Class c2 = Class.forName("zla nazwa klasy"); // <- to wyrzuci wyjątek ClassNotFoundException

			System.out.println("Dzień dobry. ");
			try {
				FileReader fileReader = new FileReader("aaaa");
			} catch (FileNotFoundException e) {
				System.out.println("Wystąpił błąd w dostępie do pliku");
			}
			System.out.println("Do widzenia. ");

			Class c3 = Class.forName("aaaa");

		} catch (ClassNotFoundException e) {
			System.out.println("Wystąpił błąd: " + e.getMessage());
			System.out.println(e.getCause());
//			e.printStackTrace();
		}

	}
}
