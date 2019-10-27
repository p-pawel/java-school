package part13.task11;

import java.text.Collator;
import java.util.*;

public class Task18 {

    private static PersonArrayFactory personArrayFactory = new PersonArrayFactory();

    public static void main(String[] args) {

        Person[] personArray = personArrayFactory.createArray();

        // Collator potrzebujemy do poprawnego sortowania polskich nazw miast
        // bo inaczej Łódź zostawała za Opolem

        Locale locale = new Locale("pl", "PL");
        Collator collator = Collator.getInstance(locale);

        Map<String, Set<Person>> peopleByCity = new TreeMap<>(collator);
        for (Person person : personArray) {
            String city = person.getCity();
            peopleByCity.putIfAbsent(city, new HashSet<>());
            Set<Person> people = peopleByCity.get(city);
            people.add(person);
        }

        System.out.println(peopleByCity);

    }
}

