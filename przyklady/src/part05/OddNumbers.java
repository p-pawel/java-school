package part05;

import java.util.Arrays;

/*
        Chcemy otrzymać dziesięcioelementową tablicę liczb typu int,
        która będzie wypełniona liczbami według poniższych założeń:
        (1) dla indeksu nieparzystego, w bieżącej pozycji w tablicy przypisujemy wartość indeksu,
        (2) dla indeksu parzystego, do bieżącej pozycji w tablicy przypisujemy wartość indeksu+1.
        W rezultacie chcemy otrzymać tablicę która zawierającą takie liczby:
                                    [1, 1, 3, 3, 5, 5, 7, 7, 9, 9]
 */
public class OddNumbers {

    public static void main(String[] args) {


        int[] table = new int[10];

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























































