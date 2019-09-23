package part07.sub06;

public class StaticsCounter {

    public static void main(String... args) {

        {
            Item item = new Item(2);
            System.out.println("x = " + item.x);
            System.out.println("counter = " + item.counter);
        }
        {
            Item item = new Item(3);
            System.out.println("x = " + item.x);
            System.out.println("counter = " + item.counter);
        }
        {
            Item item = new Item(4);
            System.out.println("x = " + item.x);
            System.out.println("counter = " + item.counter);
        }
        {
            Item item = new Item(5);
            System.out.println("x = " + item.x);
            System.out.println("counter = " + item.counter);
        }


    }

}


class Item {

    static int counter;

    int x;

    public Item(int x) {
        this.x = x;
        counter++;
    }
}