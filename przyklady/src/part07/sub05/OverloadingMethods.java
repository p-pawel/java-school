package part07.sub05;

/**
 *  Przeciążanie - overloading
 */
public class OverloadingMethods {

    public static void main(String... args) throws Exception {


        System.out.println("Aaaa");
        System.out.println(0);
        System.out.println(0L);
        System.out.println(0.0);
        System.out.println(0.0f);

        hello("World");
        hello(2);
        hello(2.0);
    }

    public static void hello(String x) {
        System.out.println("Hello " + x);
    }

    public static int hello(int x) throws Exception {
        System.out.println("Hello " + x);
        return 0;
    }

    public static void hello(double x) {
        System.out.println("Hello " + x);
    }

    public static void hello(Object object) {
        System.out.println("Hello " + object);
    }

    // a takiej nie możemy, bo już jest inna metoda, który obsłuży wywołanie hello(int):
//    public static void hello(int x) throws Exception {
//        System.out.println("Hello " + x);
//    }

}
