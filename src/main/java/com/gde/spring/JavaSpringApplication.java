package com.gde.spring;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaSpringApplication {

    /**
     * Explain the purpose of main function
     * @param args basic understanding of args
     */
    public static void main(String[] args) {

        // Brief explanation on usages and advantages
        Path path = Paths.get("example.txt");
        try {
            Files.write(path, "Hello, NIO!".getBytes());
            String content = new String(Files.readAllBytes(path));
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
