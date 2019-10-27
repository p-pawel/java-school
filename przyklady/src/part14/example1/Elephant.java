package part14.example1;

class Elephant {
    protected int weight;
    public Elephant() {
        System.out.println("Hello I am an Elephant, no args");
    }
    public Elephant(int weight) {
        System.out.println("Hello I am an Elephant, weight " + weight);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}

class AfricanElephant extends Elephant {

    public AfricanElephant() {
        this(2000);
        System.out.println("Hello I am an AfricanElephant, no args");
    }

    public AfricanElephant(int weight) {

//        super(weight);
        super.weight = weight;

        System.out.println("Hello I am an AfricanElephant, weight " + weight);
    }

    public AfricanElephant(int weight, int age) {
        this();
        System.out.println("Hello I am an AfricanElephant, weight " + weight +", age " + age);
    }
}

class IndianElephant extends Elephant {
    public IndianElephant(int weight) {
        super(weight);
        System.out.println("Hello I am an IndianElephant");
    }
}

class ElephantTester {
    public static void main(String[] args) {
//        Elephant elephant = new Elephant(4000);
//        AfricanElephant african = new AfricanElephant(5000);
//        IndianElephant indian = new IndianElephant(2000);

//        System.out.println(elephant.getWeight());
//        System.out.println(african.getWeight());
//        System.out.println(indian.getWeight());

//        System.out.println(new AfricanElephant().getWeight());

        AfricanElephant african = new AfricanElephant(5000, 10);
        System.out.println(african.getWeight());
    }
}

// sprawdzić kłódki w Hierarchy


class Whatever {
    public Whatever() {
        super();
    }
}