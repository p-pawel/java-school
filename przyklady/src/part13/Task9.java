package part13;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task9 {

    public static void main(String[] args) {

        String text = "HashMap";

        Map<Character, Integer> result = new LinkedHashMap<>();

        String textUpCase = text.toUpperCase();

        for (char c : textUpCase.toCharArray()) {

            int v = result.getOrDefault(c, 0);
            result.put(c, v + 1);
        }

        System.out.println(result);

    }
}

