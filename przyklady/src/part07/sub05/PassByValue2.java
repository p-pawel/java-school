package part07.sub05;

public class PassByValue2 {

    public static void doSth(int number) {
        number = number * 3;
    }

    public static void main(String... args) {
        String name = "aaaa";
        hello(name);
        System.out.println(name);

        StringBuilder nameBuilder = new StringBuilder("bbb");
        hello(nameBuilder);
        System.out.println(nameBuilder);
    }

    public static void hello(String a) {
        a = "Hello " + a;
    }

    public static void hello(StringBuilder a) {
        a.append(" Hello");                        // zmieniamy stan

        a = new StringBuilder(a + " Goodbye");     // ale nie stworzymy nowego obiektu
    }

}

