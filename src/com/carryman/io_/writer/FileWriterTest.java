package com.carryman.io_.writer;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author carry man
 * @version 1.0
 */
public class FileWriterTest {
    @Test
    public void fileWriter() throws IOException {
        try (FileWriter fileWriter=new FileWriter("d:\\1.txt",true)){
            char [] a= {'a','v','a','v'};
            fileWriter.write('a');
            fileWriter.write(a);
            String name="帆帆帆帆";
            fileWriter.write(name.toCharArray(),1,1);
            fileWriter.write("风雨之后见彩虹");
            fileWriter.write("风雨之后见彩虹",5,2);
        }
    }
}
