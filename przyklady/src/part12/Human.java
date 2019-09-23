package part12;

public class Human implements Omnivore {

    @Override
    public void eatMeat() {
        System.out.println("Jestem człowiek i jem mięso.");
    }

    @Override
    public void eatPlants() {
        System.out.println("Jestem człowiek i jem roślinę.");
    }

    @Override
    public void drinkMilk() {
        System.out.println("Jestem człowiek i piję mleko.");
    }
}
