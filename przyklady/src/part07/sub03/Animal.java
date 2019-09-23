package part07.sub03;                   // P

import java.util.Random;                // I

class Animal {                          // C

    Vegetable vegetable;

    public void a() {

        int a = new Random().nextInt(); // random dodany trochę na siłę, żeby uzasadnić import powyżej

        // ustaw kursor na metodzie "hello" i naciśnij Ctrl + Q żeby zobaczyć dokumentację JavaDoc:
        vegetable.hello(a, "", 2L);
    }
}

/**
 * Klasa reprezentująca warzywa
 */
class Vegetable {

    /**
     * Metoda witająca warzywo.
     * @param a liczba wejściowa
     * @param b nazwa
     * @param c ilość powtórzeń
     */
    public void hello(int a, String b, long c) {

    }

}


// komentarze

/*

fewfewew

 */