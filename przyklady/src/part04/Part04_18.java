package part04;


public class Part04_18 {

    public static void main(String[] args) {


        int i = 1;
        int j = 2;

        if (2 > 1 || i < j) {
            System.out.println("A");
        } else if (3 > 1) {
            System.out.println("B");
        } else if (4 > 1) {
            System.out.println("B");
        } else if (5 > 1) {
            System.out.println("B");
        } else if (6 > 1) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }


        // ternary:

        ///    <WARUNEK> ?  <WYNIK JEŚLI TRUE> : <WYNIK JEŚLI FALSE>

        System.out.println(true ? "true" : "false");

        System.out.println(!true ? "true" : "false");

        System.out.println(!true ? 1 + 2 : 3 + 4);
    }
}