package part06;

public class Patterns2 {

    public static void main(String[] args) {

        String regexp = "\\d{2}-\\d{3}";

        System.out.println("12-345".matches(regexp));
        System.out.println("12-34a".matches(regexp));
        System.out.println("12-3456".matches(regexp));
        System.out.println("    12-345  ".matches(regexp));
        System.out.println("    12-345  ".trim().matches(regexp));
    }

}