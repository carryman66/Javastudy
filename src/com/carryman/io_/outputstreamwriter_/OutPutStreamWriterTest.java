package com.carryman.io_.outputstreamwriter_;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author carry man
 * @version 1.0
 */
public class OutPutStreamWriterTest {
    @Test
    public void out() throws IOException {
       try( BufferedWriter utf8 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\5.txt")));){
           utf8.write("aaa");
       }
    }
}
