package part13;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task10 {

    public static void main(String[] args) {

        String text = "HashMap";

        Map<Character, Integer> result = new HashMap<>();

        String textUpCase = text.toUpperCase();

        for (char c : textUpCase.toCharArray()) {

            int v = result.getOrDefault(c, 0);
            result.put(c, v + 1);
        }

        System.out.println(result);

        Map<Character, Integer> treeMap = new TreeMap<>(result);
        System.out.println(treeMap);

    }
}

