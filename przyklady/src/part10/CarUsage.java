package part10;

import java.util.Arrays;

public class CarUsage {

    public static void main(String[] args) {


        Engine engine = new Engine();
        engine.setCapacity(1800);
        engine.setFuel("Hybrid");

        Car car = new Car("white", "Skoda", 2010);
        car.setRegistrationPlate("SK 12345");
        car.changeColour("red");
        car.updateMileage(180_000);
        car.setEngine(engine);

        System.out.println(car);

        car.ignite();
        System.out.println(car);


        Car car2 = new Car("black", "Wołga", 1950);
        System.out.println(car2);


        int i = 0;
        Car samochod = new Car("", "", 1);

        int[] x, y, z;
        int a[], b, c[];

        int[] tabInt = new int[10];
        System.out.println(Arrays.toString(tabInt));

        Car[] tabCar = new Car[3];
        tabCar[1] = new Car("red", "porsche", 2020);
        tabCar[2] = car;
        System.out.println(Arrays.toString(tabCar));

        System.out.println(car.getColour());         // pobieranie wartości pola (get)
        System.out.println(car2.getColour());

        car.setColour("Pink");                      // ustawianie wartości pola (set)

        System.out.println(car);

        Car carNoParam = new Car();
        System.out.println(carNoParam);

        new CarUsage().hello();

    }

    public void hello() {

        {
            Engine engine = new Engine();
            engine.setCapacity(1800);
            engine.setFuel("Hybrid");

            Car car = new Car("white", "Skoda", 2010);
            car.setRegistrationPlate("SK 12345");
            car.changeColour("red");
            car.updateMileage(180_000);
            car.setEngine(engine);
        }

        {
            Car car = new Car("white", "Skoda", 2010);
            car.setRegistrationPlate("SK 12345");
            car.changeColour("red");
            car.updateMileage(180_000);

            Engine engine = new Engine();
            engine.setCapacity(1800);
            engine.setFuel("Hybrid");
            car.setEngine(engine);
        }

        {
           Driver robert = new Driver()
                    .setName("Robert");

            Car car = new Car("white", "Skoda", 2010)
                    .setRegistrationPlate("SK 12345")
                    .setColour("red")
                    .setMileage(1100)
                    .setEngine(
                            new Engine()
                                    .setCapacity(1800)
                                    .setFuel("Hybrid")
                    )
                    .setDriver(robert);

            System.out.println(car);
        }

        {
            Car car = new Car("white", "Skoda", 2010);
            Engine engine = new Engine();
            car.setRegistrationPlate("SK 12345");
            engine.setCapacity(1800);
            car.changeColour("red");
            engine.setFuel("Hybrid");
            car.updateMileage(180_000);
            car.setEngine(engine);
        }


        {


//            Order order = new Order();
//            Entry[] entries = new Entry[]{ new Entry().setOrder(order) };
//            order.setEntries(entries);



        }
    }
}

