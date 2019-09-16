package part06;

public class StringsConcat {

    public static void main(String[] args) {


        // 1. Stringi możemy łączyć operatorem dodawania
        String s1 = "Hello" + " world";

        String s2 = new String(new String("Hello") + new String(" world"));

        // 2. Dodawanie = (konkatenacja) dużej liczby Stringów jest powolna i kosztowna pamięciowo
        String someNumbers = "";
        for (int i = 0; i < 100; i++) {
            someNumbers += ", " + i;
        }

        // 3. Dlatego przy tworzeniu tekstów na które będzie składać się wiele Stringów korzystamy ze StringBuildera:
        StringBuilder moreNumbers = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            moreNumbers.append(", ").append(i);
        }


        // 3. Ale ciekawostka - od Javy 6 zapis taki jak poniżej (gdzie wszystkie elementy są dodawane w jednym
        // wyrażeniu), na etapie kompilacji i tak zostanie zastąpiony przez użycie StringBuildera

        String s3 = "Hello" + " world" + " again" + " again" + " again";
        System.out.println(s3);

        // dlatego  np. taki zapis IntellijIDEA zaproponuje nam zamienić na taki jak powyżej:
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" Hello ");
        stringBuilder.append(" world ");
        stringBuilder.append(" again ");
        stringBuilder.append(" again ");
        stringBuilder.append(" again ");
        String s4 = stringBuilder.toString();
        System.out.println(s4);

        // jednak przy bardziej skomplikowanych operacjach (jak ta w pętli powyżej)
        // Java nie zoptymalizuje tego za nas - jeszcze ;) - dlatego musimy użyć StringBuilder

    }

}