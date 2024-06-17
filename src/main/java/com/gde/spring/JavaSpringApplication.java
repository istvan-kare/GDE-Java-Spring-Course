package com.gde.spring;

public class JavaSpringApplication {

    /**
     * Explain the purpose of main function
     * @param args basic understanding of args
     */
    public static void main(String[] args) {

        try {
            checkAge(15);
        } catch (Exception e) { // We handle the exception thrown in the method
            System.out.println("Exception: " + e.getMessage());
        }
    }

    static void checkAge(int age) throws Exception { // With throws we declare that this method can throw the following exception and should be handled when this method is called
        if (age < 18) {
            throw new Exception("Not eligible to vote"); // We throw and exception that will propagate upwwards
        } else {
            System.out.println("Eligible to vote");
        }
    }
}
