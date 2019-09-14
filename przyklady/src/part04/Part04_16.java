package part04;


public class Part04_16 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 20;

        System.out.println("a > b && b > c");
        System.out.println(a > b && b > c);
        System.out.println();

        System.out.println("a > b && b > c || a > b");
        System.out.println(a > b && b > c || a > b);
        System.out.println();

        System.out.println("a > b && b > c || a > b++");
        System.out.println(a > b && b > c || c++ > b);
        System.out.println();

        System.out.println("c > b && ++c > b");
        System.out.println(c > b && ++c > b);  //   <----- ZAGADKA kolejność operacji,
                   // wyjaśnienie: pierwsza część jest false więc druga nawet nie jest wyznaczana (stąd brak efektów ++)
        System.out.println();

        System.out.println("a + b > c");
        System.out.println(a + b > c);
        System.out.println();


        {
            /// TEMAT POBOCZNY: operator ~
            byte aaa = 5;   // 00000101
            byte bbb = ~5;  // 11111010


            System.out.println(aaa);
            System.out.println(bbb);

            int aa = 012;
            int hh = 0xAE;
            int bb = 0b101;

            System.out.println(aa);
            System.out.println(hh);
            System.out.println(bb);
//        System.out.println(bb >> 1);
//        System.out.println(bb << 1);

//        System.out.println(~true);  // <- nie można tak odwrócić booleana, tylko z "!", np. "!true"

        }
    }
}