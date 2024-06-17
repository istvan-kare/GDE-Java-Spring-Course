package com.gde.spring;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaSpringApplication {

    /**
     * Explain the purpose of main function
     * @param args basic understanding of args
     */
    public static void main(String[] args) {

        // Explain differences and behaviour of both List, ArrayList and LinkedList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Alice");
        arrayList.add("Bob");
        arrayList.remove(0);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Charlie");
        linkedList.add("Dave");
        linkedList.addAll(arrayList);

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
    }
}
