package part06;

public class Patterns {

    public static void main(String[] args) {


        System.out.println( "aaa".matches("aaa") );

        System.out.println( "aaa".matches(".*") );

        System.out.println( "".matches(".") );    // dowolny znak dokładnie jeden raz
        System.out.println( "".matches(".*") );   // dowolny znak dowolną ilość razy
        System.out.println( "".matches(".+") );   // dowolny znak dodatnią ilość razy
        System.out.println( "".matches(".?") );   // dowolny znak wystąpi lub nie

        System.out.println( "Katowice".matches("i") );    // "i" dokładnie jeden raz
        System.out.println( "Katowice".matches("i*") );   // "i" dowolną ilość razy
        System.out.println( "Katowice".matches("i+") );   // "i" dodatnią ilość razy
        System.out.println( "Katowice".matches("i?") );   // "i" wystąpi lub nie

        System.out.println( "Katowice".matches("s") );    // "i" dokładnie jeden raz
        System.out.println( "Katowice".matches("s*") );   // "i" dowolną ilość razy
        System.out.println( "Katowice".matches("s+") );   // "i" dodatnią ilość razy
        System.out.println( "Katowice".matches("s?") );   // "i" wystąpi lub nie

        System.out.println( "Katowice".matches(".*i.*") );
        System.out.println( "Katowice".matches(".*s.*") );
        System.out.println( "Katowice".matches(".*s?.*") );
        System.out.println( "Katowice".matches(".*s+.*") );

        System.out.println( "Opole".matches(".*[ab]+.*") );
        System.out.println( "Katowice".matches(".*[abc]+.*") );

        System.out.println( "Opole".matches(".*[^abc]+.*") );

        System.out.println( "Opole".matches(".*[^Opole]+.*") );
        System.out.println( "Opole".matches(".*[^Katowice]+.*") );




    }

}