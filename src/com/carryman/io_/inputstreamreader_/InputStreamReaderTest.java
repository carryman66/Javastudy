package com.carryman.io_.inputstreamreader_;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author carry man
 * @version 1.0
 */
public class InputStreamReaderTest {
    @Test
    public void changReaderCharset() throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\2.txt"), "gbk"));) {
            String s = bufferedReader.readLine();
            System.out.println(s);

        }
    }

//        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\2.txt"));
//
//        String s = bufferedReader.readLine();
//        System.out.println(s);
//
//        bufferedReader.close();


}
