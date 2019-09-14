package part04;


public class Part04_13 {

    public static void main(String[] args) {

        {
            int x = 2;

            x++;
            ++x;

            System.out.println(x);

        }
        System.out.println();

        {
            int x = 2;
            int y = x++;        // równoważne zapisowi:   y = x; x = x + 1

            System.out.println(x);
            System.out.println(y);
        }
        System.out.println();

        {
            int x = 2;
            int y = ++x;      // równoważne zapisowi:   x = x + 1; y = x
            System.out.println(x);
            System.out.println(y);
        }
        System.out.println();

        {
            int x = 2;

            int emo = (++x + x++);   // równoważne zapisowi:    x = x + 1; y = x + x; x = x +1
            System.out.println(x);
            System.out.println(emo);
        }




    }

}
