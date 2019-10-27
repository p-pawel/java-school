package part14.example5;

public class InheritedStaticMethodExample {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        someClass.hello();

        ChildClass childClass = new ChildClass();
        childClass.hello();

        SomeClass polimorphed = new ChildClass();
        polimorphed.hello();
    }
}

class SomeClass {
    public static void staticHello() {
        System.out.println("hello static SomeClass");
    }
    public final void hello() {
        staticHello();
    }
}

class ChildClass extends SomeClass {
    public static void staticHello() {
        System.out.println("hello static ChildClass");
    }
    public void hello2() {
        staticHello();
    }
}