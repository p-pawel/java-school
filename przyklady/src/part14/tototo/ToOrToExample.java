package part14.tototo;

import java.util.*;
import java.util.stream.Collectors;

public class ToOrToExample {
    public static void main(String[] args) {
        ComposingClass composingClass = new ComposingClass();
        composingClass.addAndCheck(12);

        InheritingClass inheritingClass = new InheritingClass();
        inheritingClass.add(123);
        inheritingClass.addAndCheck(123);


    }
}



class InheritingClass extends ArrayList /*, HashSet*/ {
    void action() {
        System.out.println(this.size());
    }
    public void addAndCheck(int i) {
        if (i>0) {
            this.add(i);
        } else {
//            hashSet.add(i);
        }
    }
}

class ComposingClass {
    private ArrayList arrayList = new ArrayList();
    private HashSet hashSet = new HashSet();

    public void addAndCheck(int i) {
        if (i>0) {

            arrayList.add(i);
        } else {
            hashSet.add(i);
        }
    }

    void action() {
        System.out.println(arrayList.size());
    }

    public void accept(Collection<Integer> coll) {
        for (Integer i : coll) {

        }

        coll.stream().collect(Collectors.toList());

    }


    public static void main(String[] args) {
        ComposingClass composingClass = new ComposingClass();
        composingClass.accept(new ArrayList<>());
        composingClass.accept(new HashSet<>());
        composingClass.accept(new PriorityQueue<>());
    }
}


class Point2D {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Point3D extends Point2D {  // to nie jest JEST
    int z;
}

class Point3Dalt {
    int x;
    int y;
    int z;
}

class Point3Dalt2 {
    Point2D plainPoint;
    int z;

    public int getX() {
        return plainPoint.getX();
    }
    public int getY() {
        return plainPoint.getY();
    }
    public int getZ() {
        return z;
    }
}


class Test {
    public static void main(String[] args) {
        System.out.println("Java".hashCode());
        System.out.println("Java".hashCode());
        System.out.println("Java".hashCode());
        System.out.println("Java".hashCode());
        System.out.println("Java".hashCode());
        System.out.println("Java".hashCode());
    }
}