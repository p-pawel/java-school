package part15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo2 {

	public static void main(String[] args) throws ClassNotFoundException {

		try (FileReader fileReader = new FileReader("/usr/lib/jvm/java-8-oracle/bin/java")) {

			Class c3 = Class.forName("aaaa");

		} catch (FileNotFoundException e) {
			System.out.println(e.getClass().getSimpleName());
			e.printStackTrace();

		} catch (IOException e) {
			System.out.println(e.getClass().getSimpleName());
			e.printStackTrace();
		}
	}
}

