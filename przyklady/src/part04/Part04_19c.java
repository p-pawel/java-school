package part04;


public class Part04_19c {

    public static void main(String[] args) {

        String value = "AAA";

        switch (value) {     // <--- switch na typie String jest dozwolony od Javy 7

            case "AAA": {
                int result = 10;
                System.out.println("A");
                System.out.println(result);
                break;
            }

            case "BBB": {
                int result = 20;
                System.out.println("B");
                System.out.println(result);
                break;
            }

            case "CCC": {
                int result = 30;
                System.out.println("C");
                System.out.println(result);
//                break;
            }

            default: {
                int result = 0;
                System.out.println("D");
                System.out.println(result);
            }
        }

        System.out.println("X");


    }


    enum Gender {
        MALE, FEMALE, UNKNOWN
    }
}