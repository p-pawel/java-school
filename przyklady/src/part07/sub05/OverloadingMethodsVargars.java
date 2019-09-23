package part07.sub05;

public class OverloadingMethodsVargars {


    public static void main(String... args) throws Exception {
        hello(10);
    }

    public static void hello(int i) {
        System.out.println("int");
    }

    public static void hello(String s, int... ii) {
        System.out.println("String, int...");
    }

    // varargs może być tylko ostatnim parametrem, więc to nie skompiluje się:
//    public static void hello(int... ii, String s) {
//        System.out.println("int..., String");
//    }

    public static void hello(int... ii) {
        System.out.println("int...");
    }

    // poniższe spowoduje błąd komplikacji bo mamy już hello(int[])
//    public static void hello(int[] ii) {
//        System.out.println("int[]");
//    }


}


