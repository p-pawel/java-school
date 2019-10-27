package part13.task11;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Task17 {

    private static PersonArrayFactory personArrayFactory = new PersonArrayFactory();

    public static void main(String[] args) {

        Person[] personArray = personArrayFactory.createArray();

        Map<String, Set<Person>> peopleByCity = new LinkedHashMap<>();
        for (Person person : personArray) {
            String city = person.getCity();
            peopleByCity.putIfAbsent(city, new HashSet<>());
            Set<Person> people = peopleByCity.get(city);
            people.add(person);
        }

        System.out.println(peopleByCity);

    }
}

