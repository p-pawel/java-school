package part05;

import java.util.Arrays;


public class BubbleSortWithFlag {

    public static void main(String[] args) {

        int[] table = {4, 3, 2, 1, 2, 3, 5, 7, 8, 1 , 4, 3, 3};

        int n = table.length;

        for (int i = 0; i < n - 1; i++) {   // i = ile już nie musimy porównywać

            boolean swapped = false;

            System.out.println(Arrays.toString(table));

            for (int j = 0; j < n - 1 - i; j++) {


                if (table[j] > table[j + 1]) {
                    int tmp = table[j];
                    table[j] = table[j + 1];
                    table[j + 1] = tmp;

                    swapped = true;
                }

            }

            if (!swapped) {
                break;
            }
        }

        System.out.println();
        System.out.println(Arrays.toString(table));


    }


}