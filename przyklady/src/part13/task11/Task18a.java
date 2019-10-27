package part13.task11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task18a {

    private static PersonArrayFactory personArrayFactory = new PersonArrayFactory();

    public static void main(String[] args) {

        Person[] personArray = personArrayFactory.createArray();

        // Zadanie 18 a - sortujemy miasta malejąco według liczby "Person"

        Map<String, Set<Person>> peopleByCity = new HashMap<>();
        for (Person person : personArray) {
            String city = person.getCity();
            peopleByCity.putIfAbsent(city, new HashSet<>());
            Set<Person> people = peopleByCity.get(city);
            people.add(person);
        }

        Set<Map.Entry<String, Set<Person>>> entries = peopleByCity.entrySet();
//        Set<Map.Entry<String, Set<Person>>> set = new TreeSet<Map.Entry<String, Set<Person>>>(new ComparatorByValueSize());

        System.out.println(peopleByCity);

    }
}

class ComparatorByValueSize {
}
