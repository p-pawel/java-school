package part14.example2;

public class MethodExceptionExample {

    public static void main(String[] args) {
        SomeClass someClass = new ChildClass();
        someClass.hello();
    }

}

class SomeClass {

    public void hello() {
        System.out.println("hello SomeClass");
    }
}

class ChildClass extends SomeClass {

    @Override
    public void hello() throws RuntimeException  {
        System.out.println("hello SomeClass");
        throw new RuntimeException();
    }
}