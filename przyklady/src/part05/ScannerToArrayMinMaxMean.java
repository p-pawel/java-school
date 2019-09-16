package part05;

import java.util.Arrays;
import java.util.Scanner;


public class ScannerToArrayMinMaxMean {

    public static void main(String[] args) {
        int[] table = new int[5];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < table.length; i++) {
            table[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(table));

        int min = table[0];
        int max = table[0];

        int sumInt = 0;
        double sumDouble = 0;

        for (int i = 0; i < table.length; i++) {

            if (min > table[i]) {
                min = table[i];
            }

            if (max < table[i]) {
                max = table[i];
            }

            sumInt += table[i];
            sumDouble += table[i];

        }
        double meanFromDouble = sumDouble/table.length;
        double meanFromInt = (double)sumInt/table.length;

        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("sumInt: " + sumInt);
        System.out.println("sumDouble: " + sumDouble);
        System.out.println("mean no double : " + sumInt/table.length);
        System.out.println("meanFromDouble: " + meanFromDouble);
        System.out.println("meanFromInt: " + meanFromInt);

    }


}