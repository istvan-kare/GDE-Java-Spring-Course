package com.gde.spring;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaSpringApplication {

    /**
     * Explain the purpose of main function
     * @param args basic understanding of args
     */
    public static void main(String[] args) {

        try (
            FileInputStream sourceStream = new FileInputStream("src/main/java/com/gde/spring/input.txt");
            FileOutputStream targetStream = new FileOutputStream("src/main/java/com/gde/spring/destination.txt")
            // Adding the stream initialization as such is the same as calling close in a finally block
        ) {

            // Reading source file using read method
            // and write to file byte by byte using write method
            int temp;
            while ((temp = sourceStream.read()) != -1)
                targetStream.write((byte) temp);
        } catch (IOException e) {
            System.err.println("Error during file manipulation: " + e.getMessage());
        }
    }

    // BufferedReader comes in handy if we want to read text from any kind of input source whether that be files, sockets, or something else
    // It enables us to minimize the number of I/O operations by reading chunks of characters and storing them in an internal buffer.
    void bufferedReaderAndWriter() {
        try (
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
