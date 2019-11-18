package part15;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo6 {

	public static void main(String[] args) {


//			Class c2 = Class.forName("workshop.ExceptionsDemo3");
		try {
			Class c2 = Class.forName("zla nazwa klasy"); // <- to wyrzuci wyjątek ClassNotFoundException
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("Dzień dobry. ");
		try {
			FileReader fileReader = new FileReader("aaaa");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Do widzenia. ");

	}
}
