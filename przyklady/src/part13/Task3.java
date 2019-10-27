package part13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task3 {

    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>();
        for (int i=1; i<=30; i++) {
            if (i % 3 == 0) {
                collection.add(i % 7);
            }
        }
        System.out.println(collection);

        Collection<Integer> collection1 = IntStream.range(1, 31)
                .filter(i -> i % 3 == 0)
                .map(e -> e % 7)
                .boxed()
                .collect(Collectors.toSet());

        IntStream.range(1, 31)
                .filter(i -> i % 3 == 0)
                .map(e -> e % 7)
                .boxed()
                .forEach(System.out::println);

//        System.out.println(collection1);

    }
}
