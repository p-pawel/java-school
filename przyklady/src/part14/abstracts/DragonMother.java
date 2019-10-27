package part14.abstracts;

class DragonMother {
    public static void main(String[] args) {
        Dragon dragon1 = new Bazyliszek();
        dragon1.hello();
        dragon1.whereAreYou();
        dragon1.setTemperature(2000);
        dragon1.fire();

        Dragon dragon2 = new Wawelsky();
        dragon2.hello();
        dragon2.whereAreYou();
        dragon2.setTemperature(3000);
        dragon2.fire();

        Sheep sheep = new NiceSheep();

        Monster monster = new ConcreteMonster();
    }
}
