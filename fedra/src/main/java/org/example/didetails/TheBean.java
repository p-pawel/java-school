package org.example.didetails;

public class TheBean {
    private String name;

    public String getName() {
        return name;
    }

    public TheBean setName(String name) {
        System.out.println(name);

        this.name = name;
        return this;
    }
}
