package part08.pakiet1;

/**
 *
 *
 * Cztery typy modyfikatorów dostępu:
 *
 *      private                         - do tego pola lub metody dostęp mamy tylko z naszej klasy
 *      package-private (domyślny)      - do tego pola lub metody dostęp mamy tylko z naszego pakietu
 *      protected                       - do tego pola lub metody dostęp mamy tylko z naszej klasy i klas pochodnych
 *      public                          - do tego pola lub metody dostęp mamy wszędzie
 */
 public class AccessModifiersItem {
    private int a;
    /*package-private*/ int b;
    protected int c;
    public int d;

    public void hello() {
        System.out.println(a);
    }
    public void helloB() {
        System.out.println(b);
    }
    public void helloC() {
        System.out.println(c);
    }

}

