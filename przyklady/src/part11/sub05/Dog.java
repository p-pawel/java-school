package part11.sub05;

public class Dog {

    byte b;
    short s;
    int i;
    long l;

    double d;
    float f;

    boolean bool;
    char c;

    String str;
    Integer ii;
    Dog dog;

    public static void main(String[] args) {
        new Dog().hello();
    }

    public void hello() {

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        System.out.println(d);
        System.out.println(f);

        System.out.println(bool);  // false

        System.out.println(c);  // '\u0000'

        System.out.println(str);
        System.out.println(ii);
        System.out.println(dog);
    }
}
