package part07.sub03;

public class Car {                          // <--- deklaracja klasy

    // POLA:

    String colour;

    String made;

    String registrationPlate;

    boolean used;

    int year;

    long mileage;


    // METODY:

    // KONSTRUKTOR:

    public Car(String colour, String made, int year) {
        this.colour = colour;
        this.made = made;
        this.year = year;
        this.used = false;
        this.mileage = 0;
    }


    void ignite() {
        this.used = true;
    }

    void changeColour(String colour) {
        this.colour = colour;
    }

    void updateMileage(long mileage) {
        this.mileage = mileage;
    }

    // Alt+Insert -> toString
    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", made='" + made + '\'' +
                ", registrationPlate='" + registrationPlate + '\'' +
                ", used=" + used +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }

}
