package part07.sub06;

import java.util.Arrays;

/**

  metoda statyczna -> metody i pola statyczne
  metoda egzemplarza -> metody i pola statyczne
  metoda statyczna -/-> metody i pola egzemplarza
  metoda egzemplarza -> metody i pola egzemplarza

 */
public class Statics {

    public static void main(String... args) {

        JakasKlasa instance1 = new JakasKlasa();
        instance1.x = 3;
        instance1.y = 3;
        System.out.println(instance1.y);

        JakasKlasa instance2 = new JakasKlasa();
        instance2.x = 6;
        instance2.y = 6;

        System.out.println(instance1.x);
        System.out.println(instance2.x);
//        System.out.println(JakasKlasa.x); <--- do pola egzemplarza tak się nie dostaniemy 

        JakasKlasa instance3 = new JakasKlasa();
        System.out.println(instance1.y);
        System.out.println(instance2.y);
        System.out.println(JakasKlasa.y);
        System.out.println(instance3.y);

        JakasKlasa instance4 = null;
        System.out.println(instance4.y); // ciekawostka

        JakasKlasa instance5 = new JakasKlasa();
        instance5.x = 3;
        instance5.hello();
        instance5.hello2();

        JakasKlasa.hello2();

        System.out.println();

        // Z jakich do tej pory korzystaliśmy, np.
        Arrays.toString(new int[]{2, 3});
        Math.abs(-2);
    }

}

class JakasKlasa {
    int x; // pola egzemplarza (konkretnej instacji)

    static int y;

    void hello() {
        System.out.println("Hello " + x);
    }

    static void hello2() {
        System.out.println("Hello2 " + y);
    }

}

