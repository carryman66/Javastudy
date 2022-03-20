package com.carryman.io_.printerwriter;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author carry man
 * @version 1.0
 */
public class PrintWriterTest {
    @Test
    public void printwriter() throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter("d:\\12.txt"));
        printWriter.println('河');
        printWriter.close();

    }
}
