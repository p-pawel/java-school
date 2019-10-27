package part14.example1a;

class Elephant {
    private int weight;

    public Elephant() {
    }

    public Elephant(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        System.out.println("Elephant.getWeight()");
        return weight;
    }
}

class AfricanElephant extends Elephant {


    public AfricanElephant() {
    }

    public AfricanElephant(int weight) {
        super(weight);
    }

    public int getWeight() {
//        System.out.println("AfricanElephant.getWeight()");
        return (int) Math.sin(0);
    }

    public int getWeight2() {
        System.out.println("AfricanElephant.getWeight()");
        return super.getWeight();
    }

    public void hello() {
        int weight = getWeight2();
    }
}


class ElephantTester {
    public static void main(String[] args) {
        AfricanElephant african = new AfricanElephant();
        african.getWeight();
    }
}
