package part12;

public class Calf implements HerbivoreMammable {

    @Override
    public void eatPlants() {
        System.out.println("Jestem cielę i jem roślinę.");
    }

    @Override
    public void drinkMilk() {
        System.out.println("Jestem cielę i piję mleko.");
    }
}
