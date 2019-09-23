package part07.sub05;

public class MetodyUsage {

    public static void main(String[] args) {

        Metody metody = new Metody();


        metody.printSth(3, 10, 21, 32);
        metody.printSth(3, 20);
        metody.printSth("");

        metody.printSth(new int[]{0, 1, 2});

        metody.printSth(3, null); // specyficzny przypadek
    }
}
