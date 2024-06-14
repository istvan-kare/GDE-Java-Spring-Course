package com.gde.spring;

public class JavaSpringApplication {

    /**
     * Explain the purpose of main function
     * @param args basic understanding of args
     */
    public static void main(String[] args) {

        int num = 11;
        boolean result = isEven(num);

        System.out.println("Is even?\n" + result);

        addOne(num);

        System.out.println(num);
    }

    /**
     * Takes a number and determines if the passed parameter is even
     * @param num number to be evaluated
     * @return boolean value representing if the parameter num is even
     */
    // Explain parameter passing and return values
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Explain void return type, explain behaviour of parameters as demonstrated above in main
    public static void addOne(int num) {
        num++;
    }
}
