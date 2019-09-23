package part06;

public class Strings {

    public static void main(String[] args) {

        {
            String s1 = new String("Tekst");
            String s2 = new String("Tekst");

//        String s3 = s1;???
//
//        s3 = "aaa";
//
//        s1 = "bbb";

            System.out.println(s1 == s2);
            System.out.println(s1.intern() == s2.intern());
//        System.out.println(s3);
        }

        {
            String s1 = new Long(12).toString();
            String s2 = new Long(12).toString();

            System.out.println(s1==s2);

//            System.out.println(s1 == s2);
//            System.out.println(s1.equals(s2));
            System.out.println(new String("aaa") == (new String("aaa")));

        }

    }

}