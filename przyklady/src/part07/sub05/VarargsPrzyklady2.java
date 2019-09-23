package part07.sub05;

public class VarargsPrzyklady2 {


    // tu "od zawsze" mieliśmy varargs, uruchom z konsoli z parametrami
    // javac part07/sub05/VarargsPrzyklady2.java
    // java part07.sub05.VarargsPrzyklady2 Hello World
    public static void main(String... args) {

        for (int i=0; i<args.length; i++) {
            System.out.println(i + ": " + args[i]);
        }

    }


}
