package com.gde.spring;

public class JavaSpringApplication {

    /**
     * Explain the purpose of main function
     * @param args basic understanding of args
     */
    public static void main(String[] args) {

        // Explain comparison operators, <, >, <=, >=, !, ==, !=, &&, ^
        int num = 10;
        if (num == 5) {
            System.out.println("Exactly 5");
        } else if(num < 5) {
            System.out.println("Less than 5");
        } else {
            System.out.println("Greater than 5");
        }

        switch (num) {
            case 10:
                System.out.println("Ten");
                break;
            default:
                System.out.println("Not Ten");
        }
    }
}
