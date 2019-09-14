package part04;


import java.math.BigDecimal;

public class Part04_12c {

    public static void main(String[] args) {

        // Ilustracja wpływu obliczeń zmiennoprzecinkowych
        double d1 = 1.0;
        double d2 = 0.9;
        System.out.println(d1 - d2);



        // Ciekawostka: Temat spoza programu, w "poważnych" zastosowaniach użyjemy BigDecimal
        System.out.println(new BigDecimal("1.0").subtract(new BigDecimal("0.9")).toString());

    }

}
