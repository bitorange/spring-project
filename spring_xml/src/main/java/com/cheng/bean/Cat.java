package com.cheng.bean;

public class Cat implements Pet {

    private String name;

    public Cat(String name){
        this.name=name;
    }

    public void shout() {
        System.out.println("miao~");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
