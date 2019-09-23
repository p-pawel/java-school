package part07.sub10;

import java.util.Objects;

/**
 * Kontrakt dla hashCode
 *
 *   - w jednym programie wartość nie może się zmieniać
 *
 *   - jeśli x.equals(y) zwróci TRUE to x.hashCode() musi być równe y.hashCode()
 *
 *   - jeśli x.equals(y) zwróci FALSE to x.hashCode() może ale nie musi być równe y.hashCode()
 *      ( hashCode dla dwóch obiektów nie musi być taki sam dla nierównych obiektów)
 *
 *   Wniosek ---> jeśli zmieniamy/tworzymy equals lub hashCode (to zwykle powinniśmy dostosować też drugą metodę)
 *
 *
 */
public class ObjectHashCode {

    public static void main(String[] args) {

        Osoba osoba1 = new Osoba("John", "Rambo", "111111111116");
        Osoba osoba2 = new Osoba("Elton", "John", "111111111116");
        System.out.println(osoba1);

        System.out.println(osoba1.hashCode());

        System.out.println(osoba1.equals(osoba2));
        System.out.println(osoba1.hashCode() == osoba2.hashCode());
    }
}



class Osoba {
    String imie;
    String nazwisko;
    String pesel;

    public Osoba(String imie, String nazwisko, String pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

//    @Override
//    public int hashCode() {
//        return pesel.hashCode();
//    }

    // Niżej wygenerowane:

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(pesel, osoba.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesel);
    }
}