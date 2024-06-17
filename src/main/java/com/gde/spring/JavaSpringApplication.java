package com.gde.spring;

public class JavaSpringApplication {

    /**
     * Explain the purpose of main function
     * @param args basic understanding of args
     */
    public static void main(String[] args) {

        Person person = new Person();

        person.setName("Alice");
        person.setAge(23);

        System.out.println(person.getName() + " is " + person.getAge() + "years old");
    }
}
