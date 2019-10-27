package part13.task11;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class Task15 {

    private static PersonArrayFactory personArrayFactory = new PersonArrayFactory();

    public static void main(String[] args) {
        Person[] personArray = personArrayFactory.createArray();

        List<Person> personList = Arrays.asList(personArray);
        Collection<Person> personCollection = new TreeSet<>(new PersonComparator());
        personCollection.addAll(personList);

        System.out.println(personCollection.getClass().getSimpleName());
        System.out.println(personCollection.size());
        System.out.println(personCollection);
    }
}

