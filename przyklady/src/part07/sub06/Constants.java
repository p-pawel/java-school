package part07.sub06;

public class Constants {

    static final int NUMBER = 0;
    static final StringBuilder HELLO = new StringBuilder("Hello");

    public static void main(String[] args) {
        System.out.println(NUMBER);

//        NUMBER++; // nie da się zmienić bo to stała

        System.out.println(HELLO);
        // HELLO = new StringBuilder("World");

        // w przypadku typów obiektowych również nie możemy zmienić wartości zmiennej/pola, bo to jest stała
        // ale nadal możemy zmienić stan tego obiektu (podobnie jak w przypadku przekazywania
        // typów obiektowych do metod poprzez wartość)
        HELLO.append(" world");
        System.out.println(HELLO);


    }

}

