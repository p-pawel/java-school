package part05;

import java.util.Arrays;
import java.util.Scanner;


public class ScannerToArray {

    public static void main(String[] args) {
        int[] table = new int[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < table.length; i++) {
            table[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(table));


    }

}