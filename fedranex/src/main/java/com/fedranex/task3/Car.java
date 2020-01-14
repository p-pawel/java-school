package com.fedranex.task3;

public class Car {
    private long id;
    private int year;
    private String name;

    public Car(long id, int year, String name) {
        this.id = id;
        this.year = year;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public Car setId(long id) {
        this.id = id;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Car setYear(int year) {
        this.year = year;
        return this;
    }

    public String getName() {
        return name;
    }

    public Car setName(String name) {
        this.name = name;
        return this;
    }
}
