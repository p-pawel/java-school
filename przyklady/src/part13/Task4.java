package part13;

import java.util.Collection;
import java.util.HashSet;

public class Task4 {

    public static void main(String[] args) {

        Collection<Integer> collection = new HashSet<>();
        for (int i=1; i<=30; i++) {
            if (i % 3 == 0) {
                collection.add(i % 7);
            }
        }



        System.out.println(collection);

        HashSet<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(1);
//        set.add(1);
//        set.add(1);
        System.out.println(set.add(1));
        System.out.println(set.add(1));
        System.out.println(set.add(1));


    }
}
