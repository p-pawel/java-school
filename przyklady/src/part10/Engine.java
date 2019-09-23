package part10;

public class Engine {
    private double capacity;
    private String fuel;

    public double getCapacity() {
        return capacity;
    }

    public Engine setCapacity(double capacity) {
        this.capacity = capacity;
        return this;
    }

    public String getFuel() {
        return fuel;
    }

    public Engine setFuel(String fuel) {
        this.fuel = fuel;
        return this;
    }

    @Override
    public String toString() {
        return "part10.Engine{" +
                "capacity=" + capacity +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}
