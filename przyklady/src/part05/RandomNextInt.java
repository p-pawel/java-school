package part05;

import java.util.Arrays;
import java.util.Random;


public class RandomNextInt {

    public static void main(String[] args) {


        int[] table = new int[30];

        for (int i=0; i<table.length; i++) {
            Random random = new Random();

            table[i] = random.nextInt(11) + 15;
        }


        System.out.println(Arrays.toString(table));
    }
}























































