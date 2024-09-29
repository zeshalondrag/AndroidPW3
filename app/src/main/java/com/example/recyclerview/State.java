package com.example.recyclerview;

public class State {
    private String name;
    private String capital;
    private int flag;
    private String description;

    public State(String name, String capital, int flag, String description) {
        this.name = name;
        this.capital = capital;
        this.flag = flag;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public String getCapital() {
        return this.capital;
    }

    public int getFlagResource() {
        return this.flag;
    }

    public String getDescription() {
        return this.description;
    }
}
