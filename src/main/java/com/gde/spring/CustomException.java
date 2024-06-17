package com.gde.spring;

public class CustomException extends Exception { // We extend the Exception class

    public CustomException(String message) {
        super(message); // pass the constructor argument to the ancestor constructor
    }
}
