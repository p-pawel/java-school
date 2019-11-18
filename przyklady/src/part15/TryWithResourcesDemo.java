package part15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class TryWithResourcesDemo {

	public static void main(String[] args) {

		FileReader fileReader = null;
		try {
			fileReader = new FileReader("aaa");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally");

			if (Objects.nonNull(fileReader)) {
				try {
					fileReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}


	}
}

