package part14.example4;

import org.jetbrains.annotations.Contract;

public class InheritPrivateMethodExample {
    public static void main(String[] args) {
        System.out.println( new SomeClass().getWeight() );
        System.out.println( new ChildClass().getWeight() );
    }
}

class SomeClass {
    private int countWeight() {
        return 2;
    }
    public int getWeight() {
        return countWeight();
    }
}

class ChildClass extends SomeClass {
    private int countWeight() {
        return 5;
    }

    @Override
    public int getWeight() {
        return countWeight();
    }
}