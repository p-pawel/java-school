package part04;


import java.util.Arrays;

public class Part04_21_22 {

    public static void main(String[] args) {

        // WHILE ( <WARUNEK> ) {
        //   < INSTRUKCJE >
        // }

        int a = 3;
        if (a < 10) {
            System.out.println(a);
        }

        a = 3;
        while (a < 10) {
            System.out.println(a);
            a++;
        }

        a = 3;
        while (a < 10) {
            System.out.print(a++ + " ");
        }
        System.out.println();

        a = 3;
        while (a++ < 10) {
            System.out.print(a + " ");
        }
        System.out.println();


        // DO {
        //   < INSTRUKCJE >
        // } WHILE ( <WARUNEK> )

        a = 3;
        do {
            System.out.print(a++ + " ");
            System.out.print(a + " ");
        } while (a < 10);

        System.out.println();
    }

}