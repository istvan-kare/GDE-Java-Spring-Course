package com.gde.spring;

public class JavaSpringApplication {

    /**
     * Explain the purpose of main function
     * @param args basic understanding of args
     */
    public static void main(String[] args) {

        //Basic data types needed for everyday use of Java, brief explanation for each of them
        int a = 5;
        double b = 4.5;
        float c = 2.333f;
        boolean d = true;
        char e = '!';
        String f = "Hello";


        // Basic operations and expressions again explanation of the operators, mention '%' operator
        String concatenated = f+e;
        System.out.println(concatenated);

        int x = 5;
        int y = 12;
        int sum = x + y;
        System.out.println("Sum: " + sum);

        // Can go into details on what's the difference between sum++ and ++sum
        sum++;
        System.out.println("Sum+1: " + sum);

        int divideRemainder = y % x;
        System.out.println("Remainder: " + divideRemainder);
    }
}
