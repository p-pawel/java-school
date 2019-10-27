package part14.polymorphism;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class PolyExample {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Carnivore carnivore = lion;
        Mammable mammable = lion;

        carnivore.eatMeat();
        carnivore.drinkMilk();

        mammable.drinkMilk();


        lion.eatMeat();         // 1
        lion.drinkMilk();       // 2
        carnivore.eatMeat();    // 3
        carnivore.drinkMilk();  // 4
//        mammable.eatMeat();     // 5
        mammable.drinkMilk();   // 6

        Collection<Mammable> eaten = carnivore.eatenMammables();
        ArrayList<Mammable> eatenL = lion.eatenMammables();
        Collection<Mammable> eatenLL = lion.eatenMammables();
    }
}

interface Mammable {
    void drinkMilk();
}

interface Carnivore extends Mammable {
    void eatMeat();
    Collection<Mammable> eatenMammables();
}

class Lion implements Carnivore {


    @Override
    public void drinkMilk() {

    }

    @Override
    public void eatMeat() {
        System.out.println("Jestem lew i jem mięso");
    }

    @Override
    public ArrayList<Mammable> eatenMammables() {
        return new ArrayList<>();
    }
}
class Tiger implements Carnivore {


    @Override
    public void drinkMilk() {

    }

    @Override
    public void eatMeat() {
        System.out.println("Jestem tygrys i jem mięso");

    }

    @Override
    public LinkedList<Mammable> eatenMammables() {
        return new LinkedList<>();
    }
}