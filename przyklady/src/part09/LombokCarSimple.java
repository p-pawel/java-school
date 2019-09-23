package part09;

/**
 *
 * Korzystając z biblioteki Lombok Project możemy
 * adnototwać klasę adnotacjami @Getter @Setter
 * (a także innymi, np. @Data, @NoArgsConstrucotr itp),
 * a metody zostaną wygenerowane (niejawnie) w czasie kompilacji.
 *
 * Lombok Project skraca wyraźnie ilość linii kodu, jednak ma również wielu krytyków
 * którzy zarzucają że tak tworzony kod nie jest poprawnym kodem Javy.
 *
 */
public class LombokCarSimple {
    private Long id;
    private String made;
    private long mileage = 0;
}
