package part12;

public interface DefaultMethodsExample {

    default double getValue() {
        return 10.0;
    }

    static int getSomething() {
        return 8;
    }
}
