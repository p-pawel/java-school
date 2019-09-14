package part04;


public class Part04_23 {

    public static void main(String[] args) {


        //   FOR  ( <inicjalizacja> ;  <warunek konktynuowania pętli>   ;  <modyfikacja>  )
        //              instrukcja           boolean                    ;    instrukcja

        for (int i = 5; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 5; i < 10; ++i) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 3; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(j + " ");
            }
        }
        System.out.println();

        Direction d = null;


    }

    enum Direction {
        DEPARTURE, ARRIVAL
    };
}