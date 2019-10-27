package part14.example2a;

import java.util.*;

public class MethodReturnTypeExample {

    public static void main(String[] args) {
        System.out.println( new SomeClass().getSomething() );
        System.out.println( new ChildClass().getSomething() );

        SomeClass someClass = new SomeClass();

        List<Integer> val = someClass.getSomething();
        val.sort(Comparator.reverseOrder());
        System.out.println(val);
    }
}

class SomeClass {
    public List<Integer> getSomething() {
        List<Integer> integers = Arrays.asList(4, 2, 1, 3);
        return new ArrayList<>(integers);
    }
}

class ChildClass extends SomeClass {
    @Override
    public MyVector<Integer> getSomething() {
        List<Integer> integers = Arrays.asList(7, 6, 5, 8);
        return new MyVector<>(integers);
    }
}

class MyVector<T> extends Vector {

    public MyVector(List<T> integers) {
        super(integers);
    }

    @Override
    public synchronized void sort(Comparator c) {

    }
}