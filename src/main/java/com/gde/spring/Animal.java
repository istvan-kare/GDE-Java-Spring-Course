package com.gde.spring;

// Explain abstract keyword (restricted class that cannot be used to create objects)
interface Animal {

    String someField = "String"; // Interface attributes are by default public, static and final
    
    void makeSound(); // Interface methods are by default abstract and public
}
