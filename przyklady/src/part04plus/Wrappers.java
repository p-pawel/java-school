package part04plus;

public class Wrappers {

    public static void main(String[] args) {

        boolean bool = false;
        char c = 65;
        byte b;
        short s;
        int i = 0;
        long l;
        float f;
        double d = 0;

        System.out.println(bool);
        System.out.println(c);
        System.out.println(i);
        System.out.println(d);

        Boolean bool1 = null;
        Character c1 = null;
        Byte b1 = null;
        Short s1 = null;
        Integer i1 = null;
        Long l1 = null;
        Float f1 = null;
        Double d1 = 5.0;

        System.out.println(bool1);
        System.out.println(c1);
        System.out.println(i1);
        System.out.println(d1);
        System.out.println(d1.byteValue());

        for (Integer ii = 0; ii < 10; ii++) {
            System.out.println(ii);
        }

        double dd = Double.parseDouble("123.45600000");


        System.out.println(dd);

        System.out.println(Integer.compare(2, 3));
        //   2 < 3   -1
        //   2 == 3   0
        //   2 > 3    1

    }

}