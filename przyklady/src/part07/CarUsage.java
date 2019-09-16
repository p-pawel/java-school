package part07;

public class CarUsage {

    public static void main(String[] args) {

        Car car = new Car("white", "Skoda", 2010);
        car.registrationPlate="SK 12345";

        System.out.println(car);
        car.changeColour("red");
        car.updateMileage(180_000);
        System.out.println(car);

        car.ignite();
        System.out.println(car);


        Car car2 = new Car("black", "Wołga", 1950);
        System.out.println(car2);

    }
}
