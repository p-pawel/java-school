package part12;

public class Tiger implements Carnivore {

    @Override
    public void eatMeat() {
        System.out.println("Jestem tygrys i jem mięso.");
    }

    @Override
    public void drinkMilk() {
        System.out.println("Jestem tygrys i piję mleko.");
    }
}
