package com.gde.spring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaSpringApplication {

    /**
     * Explain the purpose of main function
     * @param args basic understanding of args
     */
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice");

        // Explain sorting algorithms and what happens under the hood when calling the sort method
        Collections.sort(names);
        System.out.println("Sorted: " + names);

        //Explain binary search - list needs to be sorted for it to work
        int index = Collections.binarySearch(names, "Bob");
        System.out.println("Index of Bob: " + index);

        // Explain comparators when manually sorting
        names.sort((a, b) ->
            a.substring(a.length() - 1).compareTo(b.substring(b.length() - 1)));
        System.out.println("Sorted by last character: " + names);

        int anotherIndex = names.indexOf("Bob");
        System.out.println("Another index of Bob: " + anotherIndex);
    }
}
