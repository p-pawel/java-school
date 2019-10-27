package part13;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Task5 {

    public static void main(String[] args) {

        Collection<Integer> collection = new LinkedHashSet<>();
        for (int i=1; i<=30; i++) {
            if (i % 3 == 0) {
                collection.add(i % 7);
            }
        }

        System.out.println(collection);

    }
}
