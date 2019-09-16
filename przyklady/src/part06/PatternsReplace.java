package part06;

public class PatternsReplace {

    public static void main(String[] args){

        String str = "Sosnowiec jest super!";

        System.out.println(str);

        System.out.println( str.replaceAll("Sos\\w*", "Radom") );
        System.out.println( str.replaceAll("[A-Z]\\w*", "Radom") );
        System.out.println( "Sosnowiec jest Super!".replaceAll("[A-Z]\\w*", "Radom") );
        System.out.println( "Łódź jest Super!".replaceAll("[A-Z]\\w*", "Radom") );
        System.out.println( "Warszawa jest Super!".replaceAll("[A-Z]\\w*", "Radom") );

        System.out.println( str.replace("Sos", "Radomsko") );
        System.out.println( str.replace("s", "Radomsko") );
    }

}