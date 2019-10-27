package part14.example6;

import java.util.ArrayList;
import java.util.List;

public class InheritedFieldExample {
    public static void main(String[] args) {

        SomeClass someClass = generateSomeClass();
        someClass.setX(2);
        someClass.hello();

//        ChildClass childClass = new ChildClass();
//        childClass.setX(5);
//        childClass.hello();
//
//        SomeClass someClass1 = new ChildClass();
//        someClass1.setX(2);
//        someClass1.hello();

    }

    private static List<Integer> generateList() {
        return new ArrayList<>();
    }

    private static SomeClass generateSomeClass() {
        return new SomeClass();
    }
}

class SomeClass {
    public int x;
    public void hello() {
        System.out.println(x);
    }
    public void setX(int x) {
        this.x = x;
    }
}

class ChildClass extends SomeClass {
    public int x;
    public void setX(int x) {
        this.x = x;
    }
}


class Animal {
    public int length = 2;
}
class Jellyfish extends Animal {
    public int length = 5;
    public static void main(String[] args) {

    }
}