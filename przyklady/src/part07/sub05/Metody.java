package part07.sub05;

/**
 * Minimum:
 * METODA:  [typ]  [nazwa metody] [(lista parametrow)] [{ cialo metody }]
 *
 * Mogą też pojawić się:
 *  - modyfikatory dostępu, np. public, private, protected
 *  - inne specyfikatory, np. final, static itp
 *  - lista wyjątków, np. "throws Exception, IOException"
 */

public class Metody {                          // <--- deklaracja klasy



    void doSomethingAndDontReturnAnything() {       // Pascal: PROCEDURE
        if (!(2 > 1) && (!(3>1))) {
            System.out.println("Do something");
        }
    }

    int withType() {                                // Pascal: FUNCTION

//        return 3;

        if (2 > 1) {
            return 1;
        }

        return 0;
    }



    void doSomethingAndDontReturnAnythingReturnEarly() {

        if (2 > 1) {
            return;                     /// RETURN EARLY
        }

        if (3 > 1) {
            return;
        }
    }




    // Parametry

    void whatever(int whateverA, int whateverB) {

    }

    public void walk(int a, int b) {  }


    public void body() {

        int x = 2;

        for (;;) {
            // wykona
//            break;
            return;
            // poniżej: nie wykona się
        }
    }

    // varargs

    /* ciało metody implementujemy tak samo jak by było to "public void printSth(Object object, int[] numbers)" */
    public void printSth(Object object, int... numbers) {
        if (numbers == null) {
            return;
        }

        System.out.print( numbers.length + ": " );
        for (int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }


}
