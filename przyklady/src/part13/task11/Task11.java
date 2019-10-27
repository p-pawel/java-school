package part13.task11;

import java.util.Arrays;
import java.util.Collection;

public class Task11 {

    private static PersonArrayFactory personArrayFactory = new PersonArrayFactory();

    public static void main(String[] args) {
        Person[] personArray = personArrayFactory.createArray();

        Collection<Person> personCollection = Arrays.asList(personArray);

        System.out.println(personCollection.getClass().getSimpleName());
        System.out.println(personCollection);
    }
}
