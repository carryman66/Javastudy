package com.carryman.io_.bufferedinputstream_;

import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author carry man
 * @version 1.0
 */
public class BufferInputStreamTest {
    @Test
    public void bufferedInSTest() throws IOException {
        try (BufferedInputStream bf =new BufferedInputStream(new FileInputStream("d:\\1.txt"))){
            int a= 0;
            byte [] b= new byte[1024];
            while ((a=bf.read(b))!=-1){
                System.out.println(new String(b,0,a));
            }
        }
    }

}
