package com.carryman.io_.printstream;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * @author carry man
 * @version 1.0
 */
public class PrintStreamTest {
    @Test
    public void printtest() throws IOException {
        PrintStream printStream = System.out;
        printStream.print("123");
        printStream.write("123".getBytes());

        System.setOut(new PrintStream("d:\\1.txt"));
        printStream.println("123");

        printStream.write("123".getBytes(StandardCharsets.UTF_8));
        printStream.close();
    }

    @Test
    void name() {
    }
}
