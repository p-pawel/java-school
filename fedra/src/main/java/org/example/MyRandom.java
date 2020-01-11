package org.example;

import java.util.Random;

public class MyRandom {

    private final int value;

    private MyRandom() {

        System.out.println("Losujemy " + this.toString());
        value = new Random().nextInt();
//        throw new IllegalStateException();
    }

    public static MyRandom createRandom() {
        return new MyRandom();
    }

    public int getValue() {
        return value;
    }
}
