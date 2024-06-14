package com.gde.spring;

public class JavaSpringApplication {

    /**
     * Explain the purpose of main function
     * @param args basic understanding of args
     */
    public static void main(String[] args) {
        Animal animal = new Cat(); // Cat is an Animal, so we can generalize if need be
        animal.makeSound(); // Will still Meow since it's still a Cat
//        animal.makeSound(1); this doesn't exist in animal

        if (animal instanceof Cat) { // Check if our Animal is a Cat
            Cat cat = (Cat) animal; // Redefine our Animal as Cat
            cat.makeSound(2); // Make it meow 2 times
        }
    }
}
