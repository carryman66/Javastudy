package com.carryman.io_.reader;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author carry man
 * @version 1.0
 */
public class FileReaderTest {
    @Test
    public void fileReaderTest() throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("d:\\1.txt"), StandardCharsets.UTF_8));){
            String s = bufferedReader.readLine();
            System.out.println(s);


//            int num=0;
//            while ((num=fileReader.read())!=-1){
//
//                System.out.println((char)num);
//
//            }
        }
    }
    @Test
    public void fileReader() throws IOException {
        try(FileReader fileReader = new FileReader("d:\\1.txt");){
            char c = 0;
            int num  = 0;
            while ((num=fileReader.read())!=-1){
                System.out.println((char)num);
            }
        }
    }






}
