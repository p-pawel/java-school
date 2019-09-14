package part04;


public class Part04_19b {

    public static void main(String[] args) {

        Gender value = Gender.MALE;

        switch (value) {

            case MALE: {
                int result = 10;
                System.out.println("A");
                System.out.println(result);
                break;
            }

            case FEMALE: {
                int result = 20;
                System.out.println("B");
                System.out.println(result);
                break;
            }

            case UNKNOWN: {
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