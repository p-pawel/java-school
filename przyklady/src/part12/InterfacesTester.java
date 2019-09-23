package part12;

import java.util.Arrays;

public class InterfacesTester {

    public static void main(String[] args) {

        Tiger tiger = new Tiger();

        Carnivore carnivore = tiger;
        carnivore.eatMeat();
        carnivore.drinkMilk();

        Mammable mammable = tiger;
        mammable.drinkMilk();

        Calf calf = new Calf();
        HerbivoreMammable herbivoreMammable = calf;

        Human human = new Human();

        Carnivore[] carnivoreZoo = new Carnivore[]{new Lion(), new Tiger(), human};
        Herbivore[] herbivoreZoo = new Herbivore[]{new Calf(), human};
        Mammable[] mammablesZoo = new Mammable[]{new Lion(), new Tiger(), new Calf(), human};

        System.out.println(Arrays.toString(carnivoreZoo));
        System.out.println(Arrays.toString(herbivoreZoo));
        System.out.println(Arrays.toString(mammablesZoo));
    }
}
