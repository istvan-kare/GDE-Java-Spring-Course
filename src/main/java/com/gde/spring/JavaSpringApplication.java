package com.gde.spring;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class JavaSpringApplication {

    /**
     * Explain the purpose of main function
     * @param args basic understanding of args
     */
    public static void main(String[] args) {

        User user = new User("Alice", 30);

        // Explain serialization in general when it is needed and used
        try (
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.ser"));
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.ser"))
        ) {
            out.writeObject(user);

            User deserializedUser = (User) in.readObject();

            System.out.println("Deserialized Person: " + deserializedUser.name + ", " + deserializedUser.age);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
