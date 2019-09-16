package part05;

import java.util.Arrays;

/*
   Chcemy otrzymać 16-elementową tablicę liczb typu long, która będzie wypełniona liczbami według poniższych założeń:
(1) dla indeksu nieparzystego, w bieżącej pozycji w tablicy przypisujemy wartość indeksu,
(2) dla indeksu parzystego, do bieżącej pozycji w tablicy przypisujemy wartość indeksu + 1.
W rezultacie chcemy otrzymać tablicę która zawierającą takie liczby:
 */
public class EvenNumbers {

    public static void main(String[] args) {


        long[] table = new long[16];

        for (int i = 0; i < table.length; i++) {

            if (i % 2 == 1) {
                // (1) dla indeksu nieparzystego, w bieżącej pozycji w tablicy przypisujemy wartość indeksu
                table[i] = i;


            } else {
                // (2) dla indeksu parzystego, do bieżącej pozycji w tablicy przypisujemy wartość indeksu+1.
                table[i] = i + 1;
            }

        }

        System.out.println(Arrays.toString(table));
    }
}























































