package part10;

public class Car {

    // POLA:

    private String colour = "gray";

    private String made;

    private String registrationPlate;

    private boolean used;

    private int year;

    private long mileage = 0;

    private Engine engine;

    private Driver driver;


    // METODY:

    // KONSTRUKTOR:
    public Car(String colour, String made, int year) {
        this.colour = colour;
        this.made = made;
        this.year = year;
        this.used = false;
        this.mileage = 0;
    }

    public Car() {

    }


    void ignite() {
        used = true;
    }

    void changeColour(String c) {
        colour = c;
    }

    void doSth() {
    }

    void updateMileage(long mileage) {
        if (mileage < this.mileage) {
            return;
        }
        this.mileage = mileage;
    }

    // Alt+Insert -> toString
    @Override
    public String toString() {
        return "part10.Car{" +
                "colour='" + colour + '\'' +
                ", made='" + made + '\'' +
                ", registrationPlate='" + registrationPlate + '\'' +
                ", used=" + used +
                ", year=" + year +
                ", mileage=" + mileage +
                ", engine=" + engine +
                ", driver=" + driver +
                '}';
    }

    public String getColour() {
        return colour;
    }

    public Car setColour(String colour) {
        this.colour = colour;
        return this;
    }

    public Car setMade(String made) {
        this.made = made;
        return this;
    }

    public Car setRegistrationPlate(String registrationPlate) {
        this.registrationPlate = registrationPlate;
        return this;
    }

    public Car setUsed(boolean used) {
        this.used = used;
        return this;
    }

    public Car setYear(int year) {
        this.year = year;
        return this;
    }

    public Car setMileage(long mileage) {
        this.mileage = mileage;
        return this;
    }

    public Car setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public Driver getDriver() {
        return driver;
    }

    public Car setDriver(Driver driver) {
        this.driver = driver;
        return this;
    }

    public String getMade() {
        return made;
    }

    public String getRegistrationPlate() {
        return registrationPlate;
    }

    public boolean isUsed() {
        return used;
    }

    public int getYear() {
        return year;
    }

    public long getMileage() {
        return mileage;
    }

    public Engine getEngine() {
        return engine;
    }
}
