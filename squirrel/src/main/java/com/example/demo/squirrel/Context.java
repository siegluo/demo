package com.example.demo.squirrel;

public class Context {
    private int id;
    private String state;

    public Context() {
    }

    public Context(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
