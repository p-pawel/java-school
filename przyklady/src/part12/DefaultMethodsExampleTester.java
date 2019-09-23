package part12;

public class DefaultMethodsExampleTester {

    public static void main(String[] args) {
        DefaultMethodsExampleImpl impl = new DefaultMethodsExampleImpl();
        impl.hello();

        System.out.println( DefaultMethodsExample.getSomething() );
//        System.out.println( impl.getSomething() );


    }
}
