package part05;

import java.util.Arrays;


public class BubbleSort {

    public static void main(String[] args) {

        int[] table = {5, 4, 6, 3, 5, 3, 3, 8, 3, 9};

        for (int i = 0; i < table.length - 1; i++) {
            for (int j = 0; j < table.length - 1 - i; j++) {

                if (table[j] > table[j + 1]) {
                    int tmp = table[j];
                    table[j] = table[j + 1];
                    table[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(table));

    }


}