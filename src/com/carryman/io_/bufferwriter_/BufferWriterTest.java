package com.carryman.io_.bufferwriter_;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author carry man
 * @version 1.0
 */
public class BufferWriterTest {
    @Test
    public void writerFile() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("d:\\1.txt",true));
        bufferedWriter.write("碎梦大道",0,4);
        bufferedWriter.newLine();
        bufferedWriter.close();

    }
}
