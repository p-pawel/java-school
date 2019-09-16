package part06;

public class StringsPool {

    public static void main(String[] args) {

        // Wprowadzenie: użyjemy takiej "trudnej" operacji aby otrzymać dwa Stringi o jednakowej zawartości
        // zamiast użyć prostego: String s1a = "aaa"; String s1b = "aaa", tak aby wartość
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stringBuilder1.append(", ").append(i);
        }
        String s1a = stringBuilder1.toString();

        StringBuilder stringBuilder2 = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stringBuilder2.append(", ").append(i);
        }
        String s1b = stringBuilder2.toString();

        // możemy też "oszukać" kompilator Javy wymuszając nadmiarowy konstruktor obiektu typu String (na razie działa)
        String s2a = new String("aaa");
        String s2b = new String("aaa");

        // bądź tworząc String programowo w run-time:
        String s3a = new Long(12).toString();
        String s3b = new Long(12).toString();

        // Jeszcze raz: te powyższe operacje wykonaliśmy tylko po to by zasymulować często spotykaną sytuację,
        // w której mielibyśmy teksty pochodzące z różnych fragmentów kodu, czyli takie które nie zostaną
        // uproszczone przez kompilator Javy na etapie optymalizacji naszego kodu

        // 1. Porównując Stringi samym "==" porównujemy ze sobą referencje a nie wartości
        System.out.println("Porównując z użyciem \"==\":");
        System.out.println(s1a == s1b);
        System.out.println(s2a == s2b);
        System.out.println(s3a == s3b);
        System.out.println();
        // dlatego wypisze "false"

        // 2. Pula stringów: tak możemy pokazać, że wewnętrzna reprezentacja obiektów typu String,
        // które mają taką samą zawartość będzie tym samym obiektem, nawet jeśli oba Stringi będa różnymi obiektami:
        System.out.println("Porównując wewnętrzną reprezentację (intern):");
        System.out.println(s1a.intern() == s1b.intern());
        System.out.println(s2a.intern() == s2b.intern());
        System.out.println(s3a.intern() == s3b.intern());
        System.out.println();
        // to tylko ilustracja, normalnie będzie tego wykorzystywać do porówywania tekstów


        // 3. Przy porównywaniu zawartości Stringów powinniśmy korzystać z metody equals, a nie "=="
        System.out.println("Z użyciem equals:");
        System.out.println(s1a.equals(s1b));
        System.out.println(s2a.equals(s2b));
        System.out.println(s3a.equals(s3b));
        System.out.println();

    }

}