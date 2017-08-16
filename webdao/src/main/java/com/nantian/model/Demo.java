package com.nantian.model;

/**
 * Created by nantian on 2017/8/16.
 */
public class Demo {
    private String name;
    private String password;

    public Demo() {
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
