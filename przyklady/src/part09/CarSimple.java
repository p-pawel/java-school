package part09;

public class CarSimple {

    private String colour = "gray";
    private String made;
    private long mileage = 0;

    // ALT+Insert generate getter/setter

    // uwaga: dwa proponowowane szablony tworzenia setterów


    public String getColour() {
        return colour;
    }

    public CarSimple setColour(String colour) {
        this.colour = colour;
        return this;
    }

    public String getMade() {
        return made;
    }

    public CarSimple setMade(String made) {
        this.made = made;
        return this;
    }

    public long getMileage() {
        return mileage;
    }

    public CarSimple setMileage(long mileage) {
        this.mileage = mileage;
        return this;
    }
}
