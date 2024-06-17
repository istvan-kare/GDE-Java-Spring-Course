package com.gde.spring;

public class JavaSpringApplication {

    /**
     * Explain the purpose of main function
     * @param args basic understanding of args
     */
    public static void main(String[] args) {

        try {
            int data = 50 / 0;
        } catch (ArithmeticException e) { // Catch block to handle thrown exceptions
            System.out.println("Arithmetic Exception: " + e);
        } finally { // Finally block to be always executed, like for closing network connection or file
            System.out.println("Finally block is always executed");
        }
    }
}
