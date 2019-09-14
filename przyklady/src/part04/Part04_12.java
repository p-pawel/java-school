package part04;


public class Part04_12 {

    public static void main(String[] args) {

        {
            int x = 5;
            int y = 2;

            System.out.println(x + y);
            System.out.println(x - y);
            System.out.println(x * y);
            System.out.println(x / y);
        }

        {
            double x = (double) (int) 5;   // <--- rzutowania są nadmiarowe, samo "= 5" także wystarczy
            double y = 2;
            int z = 2;

            System.out.println(x / y);
            System.out.println(x / z);

            int d2 = 5;
            double d1 = 2.0;
            System.out.println(d2 / d1);

            System.out.println(5 / 2);
            System.out.println(5.0 / 2.0);

            System.out.println((double) 5 / 2.0);

            System.out.println(x + y);
            System.out.println((int) x + y);
            System.out.println(x + (int) y);
            System.out.println((int) (x + y));


            System.out.println(x / 0);         // <---- dzielenie zmiennej typu double przez 0 nie powoduje błędu
//            System.out.println((int)x / 0);  // <----- zaś próba podzielenia zmiennej typu int spowoduje błąd


            System.out.println(5.0 / (float) 0.33333333333333333 * (float) 0.33333333333333333);

        }


        {
            System.out.println(5 % 2);

            int xxxxxx = 12121212;
        }

        {

            int x = 2;

            x++;     // => x = x + 1
            x += 2;  // => x = x + 2

            x--;     // => x = x - 1
            x -= 2;  // => x = x - 2

            x *= 2;  // => x = x * 2
            x /= 2;  // => x = x / 2
            x %= 2;  // => x = x % 2

            System.out.println(x);
        }



        {
            String s1 = "abc";
            String s2 = "def";

            System.out.println(s1 + s2);

            int i = 2;
            System.out.println(s1 + i);
            System.out.println(s1 + 2);

            double d = 2.0;
            System.out.println(s1 + d);
            System.out.println(s1 + 2.0);

            System.out.println(i + s2);
            System.out.println(2 + s2);

            System.out.println(d + s2);
            System.out.println(2.0 + s2);

            System.out.println(i + "" + d);

            System.out.println(i + 'A' + d);
            System.out.println(i + "A" + d);
        }
    }

}
