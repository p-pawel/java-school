package part12e;

import java.util.Arrays;

public class EnumTester {

    public static void main(String[] args) {
        Gender zmiennaM = Gender.MALE;
        System.out.println(zmiennaM);

        if (zmiennaM == Gender.MALE) {
            System.out.println("Tak to Male");
        }


        switch (zmiennaM) {
            case MALE:
                System.out.println("M");
                break;

            case FEMALE:
                System.out.println("F");
                break;
        }



        // Zamiana na liczbę
        System.out.println( zmiennaM.ordinal() );

        Gender zmiennaF = Gender.FEMALE;
        System.out.println( zmiennaF.ordinal() );



        // Zamiana na string

        String stringValue = zmiennaM.toString();
        System.out.println(stringValue);

        // Zamiana ze stringa
        Gender newGender = Gender.valueOf("FEMALE");
        System.out.println(newGender);

        // Dostęp do tablicy wartości
        Gender[] values = Gender.values();
        System.out.println(Arrays.toString(values));

        Gender g = Gender.values()[0];
        System.out.println(g);

        Gender x1 = Gender.MALE;
        Gender x2 = Gender.FEMALE;
        Gender x3 = Gender.MALE;


        double season1 = Season.WINTER.getAverageTemp();
        double season2 = Season.SUMMER.getAverageTemp();

    }
}
