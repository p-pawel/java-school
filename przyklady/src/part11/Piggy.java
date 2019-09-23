package part11;

public class Piggy {

    public static void main(String[] args) {
        Piggy piggy = new Piggy();

        Piggy1 p1 = new Piggy1();
        Piggy2 p2 = new Piggy2();
        Piggy3 p3 = new Piggy3(false);
//        Piggy4 p4 = new Piggy4(); // źle bo prywatny

    }

}

class Piggy1 {
}

class Piggy2 {
    public Piggy2() {
    }
}

class Piggy3 {
    public Piggy3(boolean b) {
    }
}

class Piggy4 {
    private Piggy4() {
    }
}