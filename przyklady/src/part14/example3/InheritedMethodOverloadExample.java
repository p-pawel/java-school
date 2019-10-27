package part14.example3;

import java.util.List;

public class InheritedMethodOverloadExample {
    public static void main(String[] args) {
        System.out.println(new SomeClass().hello());
        System.out.println(new ChildClass().hello());
        System.out.println(new ChildClass().hello(12));
        System.out.println(new SomeClass().hello((short) 12));
    }
}

class SomeClass {
    public Integer hello() {
        return 1;
    }
    public Integer hello(short l) {
        return 1;
    }
}

class ChildClass extends SomeClass {
    public int hello(int x, int y) {
        return 1;
    }
    public Integer hello(int x) {  // Overload
        return x + 1;
    }
//    public int hello() {
//        return 1;
//    }
}