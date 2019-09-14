package part04;


import java.util.Arrays;

public class Part04_09 {

    public static void main(String[] args) {

        {
            int[][] dwa = new int[2][];
            dwa[0] = new int[3];
            dwa[1] = new int[4];
            System.out.println(Arrays.toString(dwa));
        }

        {
            int[][] dwa = {
                    {0, 1, 2},
                    {}
//                {3, 4}
            };

            dwa[1] = new int[]{5, 6};   // "podtablicę" będącą składową głównej tabeli możemy podmienić na nową tabelę
            dwa[1] = new int[]{5, 6, 7};

//            System.out.println(dwa[1][3]);   // <-- ArrayIndexOutOfBoundsException


            System.out.println(Arrays.toString(dwa));
            System.out.println(Arrays.toString(dwa[0]));
            System.out.println(Arrays.toString(dwa[1]));

        }

        int[][] dwa2 = new int[4][4];
        System.out.println(Arrays.toString(dwa2[0]));
        System.out.println(Arrays.toString(dwa2[1]));
        System.out.println(Arrays.toString(dwa2[2]));
        System.out.println(Arrays.toString(dwa2[3]));


        int[][][] trzyWymiary = {{{0, 1}, {2}}, {{3, 4}}};

        System.out.println(Arrays.toString(trzyWymiary));
        System.out.println(Arrays.toString(trzyWymiary));


    }

}
