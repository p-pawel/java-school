package part11;


public class Rabbit {

    private final static String NAME = "Rabbit";

    private static int createZ() {
        System.out.println(NAME + ": init static field");
        return 2;
    }

    private static int createY() {
        System.out.println(NAME + ": init instance field");
        return 2;
    }


    {
        this.x = 3;
        System.out.println(NAME + ": init intance block");
    }


    int x;

    int y = Rabbit.createY();
    final static int z = Rabbit.createZ();
    final static int[] INTS;
    static {
        INTS = new int[100];
        for (int i=0; i<100; i++) {
            INTS[i]=i;
        }

        System.out.println(NAME + ": static block");
    }

    public Rabbit() {
        x = 2;
        System.out.println(NAME + ": constructor");
    }

    public static void main(String[] args) {
        Rabbit bunny = new Rabbit();
    }
}
