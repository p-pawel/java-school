package part04;


import java.util.Arrays;

public class Part04_08 {

    public static void main(String[] args) {


        int[] tablica1 = new int[2];
        long[] tablica2 = new long[]{1,2,3};
        long[] tablica2a = {1,2,3};    //   <--- lub inicjalizacja bez "new"

        tablica2[1] = 88;

        System.out.println(tablica2[0]);
        System.out.println(tablica2[1]);

//        System.out.println(tablica2[1111]);  // <--- indeks spoza tabeli spodowuje błąd wykonania

        System.out.println(tablica2.length);

        char[] tablica3 = {'A','C'};
        System.out.println(tablica3);    //   <--- ciekawy sposób wypisania tablicy znaków

        boolean[] tablica4 = new boolean[]{true, false, true, false};

        System.out.println(tablica4);
        System.out.println(Arrays.toString(tablica4));

    }

}
