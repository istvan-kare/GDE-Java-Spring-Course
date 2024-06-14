package com.gde.spring;

public class JavaSpringApplication {

    static int result = 30; // Class variable is reachable throughout the class and is available until the end of the program

    /**
     * Explain the purpose of main function
     * @param args basic understanding of args
     */
    public static void main(String[] args) {


        int a = 10; // Local variable - lifetime: until control leaves the block
        Number number = new Number(a);
        if (result > number.num) {
            int b = 20; // Block variable - lifetime: until control leaves the block
            System.out.println(b);
        }
        // System.out.println(b); // Error: b is out of scope
    }

    static class Number {
        Number(int num) { this.num = num; }
        int num; // instance variable - lifetime: until the object is available in memory
    }
}
