package part07.sub05;

public class PassByValue {

    public static void doSth(int number) {
        number = number * 3;
    }

    public static void main(String... args) {

        A a = new A();
        a.x = 3;
        System.out.println(a.x);
        doSth2(a);
        System.out.println(a.x);


        String name = "aaaa";
        hello(name);
        System.out.println(name);

    }

    public static void hello(String a) {
        a = "Hello " + a;
    }

    public static void doSth2(A a) {
        a.x = a.x * 2;

        // metoda zmienia stan obiektu
    }

}

class A {
    int x;
}