package part04;


public class Part04_15 {

    public static void main(String[] args) {

        {


            boolean b1 = true;
            boolean b2 = false;

            System.out.println(b1 && b2);
            System.out.println(b1 || b2);
            System.out.println(!b2);
            System.out.println(b1 ^ b2);


            /*

              XOR - alternatywa wykluczająca

                | 0 | 1
            -----------
              0 | 0 | 1
            -----------
              1 | 1 | 0
            -----------


             */



        }


        {

            int a = 1;
            int b = 2;
            System.out.println(b > 1 || a < 2);

        }
    }
}