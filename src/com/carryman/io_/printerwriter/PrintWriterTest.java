package com.carryman.io_.printerwriter;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * @author carry man
 * @version 1.0
 */
public class PrintWriterTest {
    @Test
    public void printwriter() throws IOException {

        PrintWriter printWriter = new PrintWriter("d:\\12.txt","utf-8");

        printWriter.println('河');
        printWriter.close();

    }
}
