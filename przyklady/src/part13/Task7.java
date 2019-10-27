package part13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task7 {

    public static void main(String[] args) {

        List<MyString> list = new ArrayList<>();
        list.add(new MyString("Katowice"));
        list.add(new MyString("Opole"));
        list.add(new MyString("Bielsko-Biała"));
        list.add(new MyString("Kraków"));

        //////////

//        list.sort(Comparator.reverseOrder());
//        list.sort(new Comparator<MyString>() {
//            @Override
//            public int compare(MyString myString, MyString t1) {
//                return -myString.compareTo(t1);
//            }
//        });
//        list.sort(new LengthComparator());
        System.out.println(list);

    }
}

class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();

//        if (s1.length() > s2.length()) {
//            return 100;
//        }
//        if (s1.length() < s2.length()) {
//            return -100;
//        }
//        return 0;
    }
}

// nie można class MyString extends String bo jest final

class MyString implements Comparable<MyString> {

    private String value;

    public MyString(String value) {
        this.value = value;
    }

    @Override
    public int compareTo(MyString myString) {
        return this.length() - myString.length();
    }

    private int length() {
        return value.length();
    }

    @Override
    public String toString() {
        return value;
    }
}