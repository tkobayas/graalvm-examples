package com.sample;

public class Person {

    private String name;

    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        System.out.println("I'm a dep jar");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
