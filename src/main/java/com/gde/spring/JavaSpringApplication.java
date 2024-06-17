package com.gde.spring;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSpringApplication {

    /**
     * Explain the purpose of main function
     * @param args basic understanding of args
     */
    public static void main(String[] args) {

        // Explain differences and behaviour of both Set, HashSet and TreeSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Alice");
        hashSet.add("Bob");
        hashSet.add("Bob"); // Duplicates are not allowed and wil  not be added to a Set

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Charlie");
        treeSet.add("Dave");

        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}
