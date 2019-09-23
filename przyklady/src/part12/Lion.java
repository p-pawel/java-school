package part12;

public class Lion implements Carnivore {

    @Override
    public void eatMeat() {
        System.out.println("Jestem lew i jem mięso.");
    }

    @Override
    public void drinkMilk() {
        System.out.println("Jestem lew i piję mleko.");
    }
}
