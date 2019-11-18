package part15;

import java.io.FileReader;

public class ExceptionsDemo7 {

	public static void main(String[] args) {


		try {
			Class c1 = Class.forName("workshop.exceptions.ExceptionsDemo3");

//			Class c2 = Class.forName("zla nazwa klasy"); // <- to wyrzuci wyjątek ClassNotFoundException

			System.out.println("Dzień dobry. ");
			FileReader fileReader = new FileReader("aaaa");
			System.out.println("Do widzenia. ");

			Class c3 = Class.forName("aaaa");

		} catch (Exception e) {
			System.out.println("Wystąpił błąd: " + e.getMessage());
//			e.printStackTrace();
		}

	}
}
