package part13;

import java.util.HashMap;
import java.util.Map;

public class Task8 {

    public static void main(String[] args) {

        String text = "HashMap";

        Map<Character, Integer> result = new HashMap<>();

        String textUpCase = text.toUpperCase();

        /* wariant z for po kolejnych znakach z napisu: */
//        for (int i = 0; i < textUpCase.length(); i++) {
//            char c = textUpCase.charAt(i);
//        }

        /* wariant z for each po tablicy znaków: */
        for (char c : textUpCase.toCharArray()) {

            /* wariant z "ręcznym" sprawdzaniem */
//            if (result.containsKey(c)) {
//                Integer v = result.get(c);
//                result.put(c, v + 1);
//            } else {
//                result.put(c, 1);
//            }

            /* wariant z metodami z domyślną wartością */
            int v = result.getOrDefault(c, 0);
            result.put(c, v + 1);
        }

        System.out.println(result);

    }
}

