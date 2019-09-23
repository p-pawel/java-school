package part12e;

public enum Gender {
    MALE(100), FEMALE(200);

    Gender(int x) {
        System.out.println("hello from constructor " + this);
    }
}
