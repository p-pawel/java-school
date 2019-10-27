package part13.task11;

import java.util.Arrays;
import java.util.Collection;

public class PersonArrayFactory {

	public static final Person[] PEOPLE = {
			new Person("Jan", "Kowalski", "Gniezno", 1950),
			new Person("Anzelm", "Kowalski", "Opole", 1960),
			new Person("Henryk", "Zając", "Kalisz", 1945),
			new Person("Jan", "Kowalski", "Gniezno", 1950),
			new Person("Janusz", "Nowak", "Gniezno", 1950),
			new Person("Sebastian", "Johanson", "Łódź", 1990),
	};

	public Person[] createArray() {
		return PEOPLE;
	}

	public Collection<Person> createCollection() {
		return Arrays.asList(createArray());
	}

}
