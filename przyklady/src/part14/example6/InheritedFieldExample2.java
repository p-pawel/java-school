package part14.example6;

public class InheritedFieldExample2 {
    public static void main(String[] args) {
        SomeClass2 someClass2a = new ChildClass2();
        ChildClass2 someClass2b = new ChildClass2();

        Object object = new ChildClass2();
        ChildClass2 castToChild = (ChildClass2) object;
        SomeClass2 castToSome = (SomeClass2) object;

        System.out.println(castToChild.x);
        System.out.println(castToSome.x);

        // Nawet IDE sugeruje nam że rzutowania są nadmiarowe
        // i mogą zostać usunięte ale w praktyce okazuje się że
        // rzutowanie lub jego brak
        // ma wpływ na wynik
        System.out.println(((ChildClass2)castToChild).x);
        System.out.println(((SomeClass2)castToSome).x);
    }
}

class SomeClass2 {
    int x = 2;
}

class ChildClass2 extends SomeClass2 {
    int x = 5;

}