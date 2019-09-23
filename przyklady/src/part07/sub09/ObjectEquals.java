package part07.sub09;

import java.util.Objects;

/**
 *
 *
 *    Kontrakt metody equals:
 *
 *     - reflexive (zwrotna)
 *                                  x.equals(x)   -> musi zwrócić true
 *
 *     - symmetric (symetryczna)
 *                                  wyniki x.equals(y) oraz y.equals(x) muszą być takie same
 *                                          true              true            OK
 *                                          false             false           OK
 *
 *     - transitive (przechodnia)
 *                                  jeśli x.equals(y) oraz y.equals(z) to tak samo x.equals(z)
 *                                         true              true                   true
 *
 *     - consistent (spójna)
 *                                 dla wielu wywołań musi zwracać ten sam wynik
 *
 *     - x.equals(null) musi zwrócić false
 *
 */
public class ObjectEquals {

    public static void main(String[] args) {

        DowodRejestracyjny sam1 = new DowodRejestracyjny(2000, "VW", "XF3456789876543234567");
        DowodRejestracyjny sam2 = new DowodRejestracyjny(2010, "Skoda", "AB32468326487326483");
        DowodRejestracyjny sam3 = new DowodRejestracyjny(1410, "Trabant", "AB32468326487326483");

        System.out.println(sam1 == sam2);
        System.out.println(sam1.equals(sam2));

        System.out.println(sam2 == sam3);
        for (int i=0;i<1_000_000; i++){
            System.out.println(sam2.equals(sam3));
        }

        System.out.println(sam3.equals(sam3));

        Objects.equals(sam1, sam2);

    }
}


class DowodRejestracyjny {
    int year;
    String made;
    String vin;

    public DowodRejestracyjny(int year, String made, String vin) {
        this.year = year;
        this.made = made;
        this.vin = vin;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof DowodRejestracyjny)) {
            return false;
        }
        DowodRejestracyjny dowodRejestracyjny = (DowodRejestracyjny) o;
        if (this.year != dowodRejestracyjny.year) {
            return false;
        }
        if (!(this.made.equals(dowodRejestracyjny.made))) {
            return false;
        }
        if (!(this.vin.equals(dowodRejestracyjny.vin))) {
            return false;
        }
        return true;
    }


}


