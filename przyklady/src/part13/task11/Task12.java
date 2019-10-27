package part13.task11;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task12 {

    private static PersonArrayFactory personArrayFactory = new PersonArrayFactory();

    public static void main(String[] args) {
        Person[] personArray = personArrayFactory.createArray();

        List<Person> personList = Arrays.asList(personArray);
        LinkedList<Person> personCollection = new LinkedList<Person>(personList);

        System.out.println(personCollection.getClass().getSimpleName());
        System.out.println(personCollection.size());
        System.out.println(personCollection);
    }
}
