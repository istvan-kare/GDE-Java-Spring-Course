package com.gde.spring;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaSpringApplication {

    /**
     * Explain the purpose of main function
     * @param args basic understanding of args
     */
    public static void main(String[] args) {

        // Explain differences and behaviour of both Map, HashMap and TreeMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Alice");
        hashMap.put(2, "Bob");

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Charlie");
        treeMap.put(4, "Dave");

        System.out.println("HashMap: " + hashMap);
        System.out.println("TreeMap: " + treeMap);

        System.out.println(treeMap.get(3)); // Get value by associated key
    }
}
