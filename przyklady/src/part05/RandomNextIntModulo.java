package part05;

import java.util.Arrays;
import java.util.Random;


public class RandomNextIntModulo {

    public static void main(String[] args) {

        int[] table = new int[30];

        Random random = new Random();
        for (int i=0; i<table.length; i++) {
            table[i] = Math.abs(random.nextInt() % 11) + 15;
        }


        System.out.println(Arrays.toString(table));
    }
}























































