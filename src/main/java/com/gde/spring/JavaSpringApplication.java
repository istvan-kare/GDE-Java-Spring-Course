package com.gde.spring;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaSpringApplication {

    /**
     * Explain the purpose of main function
     * @param args basic understanding of args
     */
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // These two do the same with the main exception being is that iterator can remove elements from the collection
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {

            String name = iterator.next();
            if (name.equals("Bob")) {
                iterator.remove();
            }
        }
        // Can be replaced by names.removeIf(...) function

        System.out.println(names);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
