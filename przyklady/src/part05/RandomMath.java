package part05;

import java.util.Arrays;


public class RandomMath {

    public static void main(String[] args) {

        int[] table = new int[30];

        for (int i=0; i<table.length; i++) {
            table[i] = (int)( Math.random() * 11 ) + 15;
        }


        System.out.println(Arrays.toString(table));
    }
}























































