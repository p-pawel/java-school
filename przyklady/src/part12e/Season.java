package part12e;

public enum Season {
    WINTER(-2),
    SPRING(10),
    SUMMER(20),
    AUTUMN(2);

    private final double averageTemp;

    public double getAverageTemp() {
        return averageTemp;
    }

    Season(double averageTemp) {
        this.averageTemp = averageTemp;
        System.out.println("hello from constructor " + this);
    }
}
