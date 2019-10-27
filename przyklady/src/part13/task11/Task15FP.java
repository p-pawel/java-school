package part13.task11;

import java.util.*;

public class Task15FP {

    private static PersonArrayFactory personArrayFactory = new PersonArrayFactory();

    public static void main(String[] args) {
        Person[] personArray = personArrayFactory.createArray();

        List<Person> personList = Arrays.asList(personArray);
//        Collection<Person> personCollection = new TreeSet<>(new PersonComparator());
        Comparator<Person> personComparator = Comparator
                .comparing(Person::getYear)
                .thenComparing(Person::getFirstName)
                .thenComparing(Person::getYear)
                .thenComparing(Person::getLastName);
        Collection<Person> personCollection = new TreeSet<>(personComparator);
        personCollection.addAll(personList);

        personList.sort(personComparator);
        System.out.println(personCollection.size());
        System.out.println(personCollection);

//        personList.sort(Comparator.comparing(Person::getLastName));
;

        System.out.println(personList.size());
        System.out.println(personList);

        HashSet<Person> set = new LinkedHashSet<>(personList);

        System.out.println(set.size());
        System.out.println(set);

    }
}

