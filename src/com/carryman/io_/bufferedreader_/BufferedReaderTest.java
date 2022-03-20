package com.carryman.io_.bufferedreader_;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author carry man
 * @version 1.0
 */
public class BufferedReaderTest {
    @Test
    public void copyFile() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("d:\\1.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("d:\\7.txt"));
        String line;
        while ((line=bufferedReader.readLine())!=null){
            //读取一行内容，没有换行符
            bufferedWriter.write(line);
            //换行
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();



    }
}
