package com.gde.spring;

public class JavaSpringApplication {

    /**
     * Explain the purpose of main function
     * @param args basic understanding of args
     */
    public static void main(String[] args) {

        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace(); // We print the stacktrace to be able to better identify the source of the error
        }
    }

    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception {
        throw new Exception("Exception in method2");
    }
}
