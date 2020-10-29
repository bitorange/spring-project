package com.cheng.service;

public class UserServiceIml implements UserService {
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void find() {
        System.out.println("find");
    }
}
