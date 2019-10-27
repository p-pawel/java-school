package part14.example1a;

public class MethodOverrideExample {
    public static void main(String[] args) {
//
//        SomeClass someClass = new SomeClass();
//        someClass.hello();

        SomeClass childClass = new ChildClass();
        childClass.hello();
    }
}

class SomeClass {
    public void hello() {
        System.out.println("SomeClass");
    }
}

class ChildClass extends SomeClass {

    @Override
    public void hello() {
        System.out.println("ChildClass");
    }

    public void publicHello() {
        hello();
    }
}