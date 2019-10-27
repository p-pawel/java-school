package part13.task11;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        if (person1.getLastName().equals(person2.getLastName())) {
            return person1.getFirstName().compareTo(person2.getFirstName());

            // tu powinniśmy dalej porównywać żeby przypadkowo nie wykluczyć duplikatów
            // ale tu sobie odpuszczamy bo wiemy że nie ma takich egzemplarzy

            // --> to samo załatwiamy Comparator.comparing.thenComparing przy programowaniu funkcyjnym
        }
        return person1.getLastName().compareTo(person2.getLastName());

    }
}
