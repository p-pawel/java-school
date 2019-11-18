package part15;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo5 {

	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException {

		try {

//			Class c2 = Class.forName("workshop.ExceptionsDemo3");
		 	Class c2 = Class.forName("zla nazwa klasy"); // <- to wyrzuci wyjątek ClassNotFoundException

			System.out.println("Dzień dobry. ");
			FileReader fileReader = new FileReader("aaaa");
			System.out.println("Do widzenia. ");
		} finally {
			System.out.println("Końcowe do widzenia.");
		}

	}
}
