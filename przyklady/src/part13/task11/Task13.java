package part13.task11;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Task13 {

    private static PersonArrayFactory personArrayFactory = new PersonArrayFactory();

    public static void main(String[] args) {
        Person[] personArray = personArrayFactory.createArray();

        List<Person> personList = Arrays.asList(personArray);
        Collection<Person> personCollection = new HashSet<>(personList);

        System.out.println(personCollection.getClass().getSimpleName());
        System.out.println(personCollection.size());
        System.out.println(personCollection);
    }
}
