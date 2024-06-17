package com.gde.spring;

public class JavaSpringApplication {

    /**
     * Explain the purpose of main function
     * @param args basic understanding of args
     */
    public static void main(String[] args) {

//        Animal animal = new Animal(); Throws error as it's an abstract class with no definition
        Animal animal = new Animal() {
            @Override
            void makeSound() {
                System.out.println("Moo!");
            }
        }; // Directly define the abstract function

        animal.makeSound();

        Cat cat = new Cat();

        cat.makeSound(); //We defined the function as part of extending the Animal abstract class
    }
}
