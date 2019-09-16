package part06;

public class StringsOperations {

    public static void main(String[] args) {

        {
            String s1 = "Katowice";

            int index = s1.indexOf("o");

            System.out.println(s1);
            System.out.println(index);

            int lastIndex = s1.lastIndexOf("o");
            System.out.println(lastIndex);
        }

        {
            String s1 = "Warszawa";

            int index = s1.indexOf("a");

            System.out.println(s1);
            System.out.println(index);

            int lastIndex = s1.lastIndexOf('a');
            System.out.println(lastIndex);

        }

        {
            String s1 = "Warszawa";

            int index = s1.indexOf("ar");

            System.out.println(s1);
            System.out.println(index);

            int lastIndex = s1.lastIndexOf("ar");
            System.out.println(lastIndex);
        }

        {
            String s1 = "Warszawa";

            int index = s1.indexOf("xxx");

            System.out.println(s1);
            System.out.println(index);

            int lastIndex = s1.lastIndexOf("xxx");
            System.out.println(lastIndex);
        }

        {
            String s1 = "Katowice";

            System.out.println(s1.startsWith("Kat"));
            System.out.println(s1.endsWith("ice"));
        }

        {
            String s1 = "Katowice";
                      // 01234567
            System.out.println(s1.substring(2));
            System.out.println(s1.substring(2, 4));
        }


        {
            String s1 = "Katowice";

            System.out.println(s1.compareTo("katowice"));
            System.out.println(s1.compareToIgnoreCase("katowice"));

            System.out.println(s1.equals("katowice"));
            System.out.println(s1.equalsIgnoreCase("katowice"));
        }

        {
            String s1 = "Katowice";
            String s2 = "Katowice\u0040";

            System.out.println(s1.charAt(2));
            System.out.println(s1.length());
            System.out.println(s2.length());
        }

        {
            String s1 = " \t \n Kato \n wice \t \n ";
            System.out.println(s1.length());

            String s2 = s1.trim();
            System.out.println(s2.length());

            System.out.println(s1);
            System.out.println(s2);
        }

        {
            String s1 = "    Kato    wice        ";
            System.out.println(s1.toUpperCase());
            System.out.println(s1.toLowerCase());
        }

    }

}