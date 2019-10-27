package part13.sub1;

class Lion { }

class Tiger { }

class Container<T> {
    private T tenant;

    public T getTenant() {
        return tenant;
    }

    public Container<T> setTenant(T tenant) {
        this.tenant = tenant;
        return this;
    }
}


public class GenericExample2 {

    public static void main(String[] args) {
        Container<Lion> lionContainer = new Container<Lion>();
        lionContainer.setTenant(new Lion());

        Container<Tiger> tigerContainer = new Container<Tiger>();
        tigerContainer.setTenant(new Tiger());

        Container<Integer> integerContainer = new Container<Integer>();
        integerContainer.setTenant(123);

        System.out.println(lionContainer.getTenant());
        System.out.println(tigerContainer.getTenant());
        System.out.println(integerContainer.getTenant());
    }

}