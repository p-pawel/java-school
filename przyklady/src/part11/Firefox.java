package part11;

public class Firefox {

    private String colour;
    private double weight;
    private final String name;

    {
        System.out.println("Hello from static init block Firefox");
    }

    public Firefox() {
        this(33.3);
    }

    public Firefox(double weight) {
        this("orange", weight);

        System.out.println("Constructor 1-parametrowy");
    }

    public Firefox(String colour, double weight) {
        this(colour, weight, "noname");

        System.out.println("Constructor 2-parametrowy");
    }

    public Firefox(String colour, double weight, String name) {
        this.colour = colour;
        this.weight = weight;
        this.name = name;

        System.out.println("Constructor 3-parametrowy");
    }


    public static void main(String[] args) {

        Firefox firefox1 = new Firefox(12.0);
        System.out.println(firefox1);

        Firefox firefox2 = new Firefox("red", 13.0);
        System.out.println(firefox2);

        Firefox firefox3 = new Firefox("red", 13.0, "Jack");
        System.out.println(firefox3);

//        new Firefox();

    }

    @Override
    public String toString() {
        return "Firefox{" +
                "colour='" + colour + '\'' +
                ", weight=" + weight +
                ", name=" + name +
                '}';
    }

    public Firefox setColour(String colour) {
        this.colour = colour;
        return this;
    }
}
