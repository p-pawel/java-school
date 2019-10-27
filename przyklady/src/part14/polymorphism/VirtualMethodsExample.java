package part14.polymorphism;

public class VirtualMethodsExample {
    public static void main(String[] args) {
        new SomeClass().hello();
        new ChildClass().hello();
    }
}


class SomeClass {

    public void hello() {
        System.out.println("Hi, I am " + whatsYourName());
    }

    public String whatsYourName() {
        return "Alojzy";
    }
}

class ChildClass extends SomeClass {

    @Override
    public String whatsYourName() {
        return "Ildefons";
    }
}