package collections;


import java.util.Objects;

public class Person {
	private String firstName;
	private String lastName;
	private String city;
	private Integer year;

	public String getFirstName() {
		return firstName;
	}

	public Person setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public Person setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public String getCity() {
		return city;
	}

	public Person setCity(String city) {
		this.city = city;
		return this;
	}

	public Integer getYear() {
		return year;
	}

	public Person setYear(Integer year) {
		this.year = year;
		return this;
	}

	@Override
	public String toString() {
		return "Person{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", city='" + city + '\'' +
				", year=" + year +
				'}';
	}

	public Person(String firstName, String lastName, String city, Integer year) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.year = year;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Person person = (Person) o;
		return Objects.equals(firstName, person.firstName) &&
				Objects.equals(lastName, person.lastName) &&
				Objects.equals(city, person.city) &&
				Objects.equals(year, person.year);
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, city, year);
	}
}