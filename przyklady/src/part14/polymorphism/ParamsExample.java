package part14.polymorphism;

/** Przykład Polymorphic Parameters */
public class ParamsExample {
    public static void main(String[] args) {

        Lion lion = new Lion();
        Carnivore carnivore = lion;
        Mammable mammable = lion;

        Tiger tiger = new Tiger();

        ParamsExample example = new ParamsExample();
        example.feed(carnivore);
        example.feed(lion);
        example.feed(tiger);
        example.feed((Carnivore) mammable);
    }

    public void feed(Carnivore carnivore) {
        carnivore.eatMeat();
    }
}
