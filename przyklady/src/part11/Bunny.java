package part11;


/**
 *
 * Etapy tworzenia obiektu
 *
 *
 */
public class Bunny extends Rabbit {

    private final static String NAME = "Bunny";
    final static int z = Bunny.createZ();

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

    int y = Bunny.createY();
    final static int[] INTS;
    static {
        INTS = new int[100];
        for (int i=0; i<100; i++) {
            INTS[i]=i;
        }

        System.out.println(NAME + ": static block");
    }


    public Bunny() {
        x = 2;
        System.out.println(NAME + ": constructor");
    }

    protected void finalize() {
        System.out.println(NAME +": finalize"); // może zostać uruchomione a nie musi
    }

    public static void main(String[] args) {

        for (;;) {
            Bunny bunny = new Bunny();
        }
    }
}
