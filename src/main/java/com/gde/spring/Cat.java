package com.gde.spring;

// Brief explanation on inheritance
public class Cat extends Animal {

    @Override
    void makeSound() {
//        super.makeSound(); Explain `super` and override

        System.out.println("Meow");
    }

    // Explain overloading
    void makeSound(int times) {

        for (int i = 0; i < times; i++) {
            makeSound();
        }
    }
}
