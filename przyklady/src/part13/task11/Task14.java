package part13.task11;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

public class Task14 {

    private static PersonArrayFactory personArrayFactory = new PersonArrayFactory();

    public static void main(String[] args) {
        Person[] personArray = personArrayFactory.createArray();

        List<Person> personList = Arrays.asList(personArray);
        Collection<Person> personCollection = new LinkedHashSet<>(personList);

        System.out.println(personCollection.getClass().getSimpleName());
        System.out.println(personCollection.size());
        System.out.println(personCollection);
    }
}
