package com.cheng.bean;

public class Dog implements Pet {
    private String name;
    public void shout() {
        System.out.println("wang~");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
