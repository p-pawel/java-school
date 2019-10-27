package part14.example1a;

public class FieldResetter {

    public static void main(String[] args) {
        BikeCounter bikeCounter = new BikeCounter();
        bikeCounter.reset();
    }
}

class Counter {
    private int count;
    public void increment() {
        count++;
    }
    public void reset() {
        this.count = 0;
        System.out.println("setting count to 0");
    }
    public int get() {
        return count;
    }
}

class BikeCounter extends Counter {
    private int km;

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public int get() {
//        super();
//        super.
        new Counter();

        return km;

    }

    @Override
    public void reset() {
//        super.reset();
        this.km = 0;
        System.out.println("setting km to 0");
    }
}