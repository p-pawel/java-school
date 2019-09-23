package part07.sub14;

final public class Finals {

    static final int x = 0;

    final int y;
    public Finals(int y) {
        this.y = y;
    }

    public void hello() {
        System.out.println("hello " + y);
    }


    public static void main(String[] args) {
        Finals finals2 = new Finals(2);
        finals2.hello();

        Finals finals3 = new Finals(3);
        finals3.hello();
    }
}

/*

 // poniższe spowoduje błąd kompilacji, bo nie możemy rozszerzać klasy która była oznaczona jako final

class ChildFinale extends Finals {

    public ChildFinale(int y) {
        super(y);
    }
}



 */