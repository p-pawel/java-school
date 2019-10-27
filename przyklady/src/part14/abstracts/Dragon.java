package part14.abstracts;

public abstract class Dragon {
    private final static String TYPE = "DRAGON";
    private int temperature;
    protected int x;

    public void fire() {
        System.out.println("Fire!");
        howFullYouAre();
    }

    public abstract void hello();
    public abstract void whereAreYou();
    protected void howFullYouAre(){ };

    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}

abstract class PolishDragon extends Dragon {

    @Override
    public void whereAreYou() {
        System.out.println("Masz problem?");
    }
}
 class Monster {
    public void hello() { };
    public void concrete() {

    }
//    public abstract void hi() {
//    };
    // <- metoda nie może jednocześnie być abstract i mieć body

    public void hi() {
        System.out.println("hi");
    }
}

abstract class AbstractMonster extends Monster {

}
class ConcreteMonster extends AbstractMonster {

}

abstract interface Monster2 {
    public abstract void hello();
    final static String TYPE = "DRAGON";
}

interface MonsterInterface extends Monster2 {

}
abstract class Sheep {
    public void hello() {
        System.out.println("hello");
    }
}
class NiceSheep extends Sheep { }

class Bazyliszek extends PolishDragon {

    @Override
    public void hello() {
        System.out.println("I am Bazyliszek!");
    }

    @Override
    protected void howFullYouAre() {
        System.out.println("100%");
    }

}

class Wawelsky extends PolishDragon {

    @Override
    public void hello() {
        System.out.println("I am Wawelsky!");
    }

    @Override
    public void whereAreYou() {
        System.out.println("Jestem na polu");
    }

    @Override
    protected void howFullYouAre() {
        System.out.println("Po litrze");
    }
}


