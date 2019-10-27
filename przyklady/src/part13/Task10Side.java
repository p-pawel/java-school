package part13;

import java.util.*;

public class Task10Side {

    /** różne warianty konstruktorów kolekcji */
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(5);


        List<Integer> list2 = new LinkedList<>(list);
        System.out.println(list2);

        Set<Integer> set1 = new HashSet<>(list);
        System.out.println(set1);

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,10);
        map.put(2,20);
        map.put(3,30);
        map.put(4,30);
        System.out.println(map);

//        Set<Integer> keys = ;
        System.out.println(map.keySet());

//        Collection<Integer> values = ;
        System.out.println(map.values());


        List<Integer> list3 = new ArrayList<>(map.keySet());
        System.out.println(list3);

    }
}

