package com.gde.spring;

public class Cat implements Animal {

    @Override // When implementing an interface you must override all of its methods
    public void makeSound() {
        System.out.println("Meow!");
    }
}
