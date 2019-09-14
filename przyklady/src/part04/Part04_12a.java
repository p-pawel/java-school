package part04;

public class Part04_12a {

    public static void main(String[] args) {

        byte b1 = 1;
        int b2 = 128;
        byte b3 = -128;
        byte b4 = (byte) 129;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);


        long l = 874398543985L;
//        long l2 = 8744632874632874863398543985L;   // <---- liczba zbyt duża, nawet jak na typ "long"


        // Kolejne przekroczenie zakresu:
        int x = 1_000_000_000;
        int y = 1_000_000_000;
        System.out.println(x * y);


        float f = 12.34f;   // <--- bez suffiksu "f" będzie niezgodność typów, bo domyślnie "ułamki" są "double"
        double d = 12; // <--- będzie z częścią ułamkową mimo że
        System.out.println(d);



    }

}
