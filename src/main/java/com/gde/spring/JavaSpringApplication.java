package com.gde.spring;

public class JavaSpringApplication {

    /**
     * Explain the purpose of main function
     * @param args basic understanding of args
     */
    public static void main(String[] args) {

        try {
            throw new CustomException("This is a custom Exception"); // We throw the custom exception
        } catch (CustomException ce) { // We handle the exception thrown
            System.out.println(ce.getMessage());
        } catch (Exception e) { // Catch blocks can be stacked to be able to easily handle multiple cases, the most generic should be the last
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
