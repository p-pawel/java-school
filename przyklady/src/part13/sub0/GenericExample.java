package part13.sub0;

class Lion { }

class Tiger { }

class LionContainer {
    private Lion tenant;

    public Lion getTenant() {
        return tenant;
    }

    public LionContainer setTenant(Lion tenant) {
        this.tenant = tenant;
        return this;
    }
}

class TigerContainer {
    private Tiger tenant;

    public Tiger getTenant() {
        return tenant;
    }

    public TigerContainer setTenant(Tiger tenant) {
        this.tenant = tenant;
        return this;
    }

}


public class GenericExample {

    public static void main(String[] args) {
        LionContainer lionContainer = new LionContainer();
        lionContainer.setTenant(new Lion());

        TigerContainer tigerContainer = new TigerContainer();
        tigerContainer.setTenant(new Tiger());

        System.out.println(lionContainer.getTenant());
        System.out.println(tigerContainer.getTenant());
    }

}