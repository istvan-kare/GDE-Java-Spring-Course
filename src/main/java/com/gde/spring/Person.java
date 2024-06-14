package com.gde.spring;

// Explain constructors and data fields along with class methods
public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void greeting() {
        System.out.println("Hello! My name is " + name + " and I'm " + age + "years old.");
    }
}
