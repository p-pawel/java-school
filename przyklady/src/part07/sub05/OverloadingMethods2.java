package part07.sub05;

public class OverloadingMethods2 {


    public static void main(String... args) throws Exception {
        hello(10);
        hello(10.0);
        hello((short)10);
    }

    public static void hello(int i) {
        System.out.println("int");
    }

    public static void hello(short s) {
        System.out.println("short");
    }

    public static void hello(double d) {
        System.out.println("double");
    }

}


