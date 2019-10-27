package part13.task11;


import java.util.Objects;

public class Person implements Comparable<Person> {
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
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getFirstName().equals(person.getFirstName()) &&
                getLastName().equals(person.getLastName()) &&
                getCity().equals(person.getCity()) &&
                getYear().equals(person.getYear());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getCity(), getYear());
    }


	@Override
	public int compareTo(Person person) {
		if (this.equals(person)) {
			return 0;
		}
		if (Objects.equals(this.year, person.year)) {
			return this.getLastName().compareTo(person.lastName);

			// i wszystkie parametry tak dalej
			// ale tu omijamy bo wiemy że więcej danych nie będzie się powtarzać
		}
		return (this.year - person.year);
	}
}