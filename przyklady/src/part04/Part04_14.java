package part04;


public class Part04_14 {

    public static void main(String[] args) {

        {
            int a = 2;
            int b = 3;

            boolean x = a == b;
            System.out.println(x);
            boolean x1 = a != b;
            System.out.println(x1);
            boolean x2 = a >= b;
            System.out.println(x2);
            boolean x3 = a > b;
            System.out.println(x3);
            boolean x4 = a <= b;
            System.out.println(x4);
            boolean x5 = a < b;
            System.out.println(x5);

/*
            Poniższe operacje porównań nie będą prawdiłowe (a drugi zapis od Javy 8 ma nawet inne znaczenie):
*/

//            System.out.println(a =< b);
//            System.out.println(a => b);

        }
    }
}