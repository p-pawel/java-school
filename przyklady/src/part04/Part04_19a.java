package part04;


public class Part04_19a {

    public static void main(String[] args) {


        int value = 2;

        switch (value) {

            case 1: {
                int result = 10;
                System.out.println("A");
                System.out.println(result);
                break;
            }

            case 2: {
                int result = 20;
                System.out.println("B");
                System.out.println(result);
                break;
            }

            case 3: {
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
}