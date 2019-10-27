package part14.polymorphism;

public class CastExample {
    public static void main(String[] args) {

        Lion lion = new Lion();

        Carnivore carnivore = lion;
        Mammable mammable;

        Lion lion2 = (Lion) carnivore;

//        Lion lion3 = (Lion) "Ssssss";    // compile error: unrelated types

        if (carnivore instanceof Tiger) {   // if bo inaczej runtime error ClassCastException
            Tiger tiger = (Tiger) carnivore;
        } else {
            System.out.println("To nie tygrys");
        }

    }
}
