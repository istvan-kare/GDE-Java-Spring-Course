package com.gde.spring;

public class JavaSpringApplication {

    /**
     * Explain the purpose of main function
     * @param args basic understanding of args
     */
    public static void main(String[] args) {

        // Explain the significance of each of the loping constructs and their use cases and their nature
        for (int i = 0; i < 5; i++) {
            System.out.println("For Loop: " + i);
        }

        int j = 0;
        while (j < 5) {
            System.out.println("While Loop: " + j);
            j++;
        }

        int k = 0;
        do {
            System.out.println("Do-While Loop: " + k);
            k++;
        } while (k < 5);
    }
}
