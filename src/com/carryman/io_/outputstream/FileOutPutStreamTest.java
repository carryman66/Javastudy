package com.carryman.io_.outputstream;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author carry man
 * @version 1.0
 */
public class FileOutPutStreamTest {
    @Test
    public void out() {
        FileOutputStream fileOutputStream = null;
        try {
//            fileOutputStream = new FileOutputStream("d://2.txt",true);
            fileOutputStream = new FileOutputStream("d://2.txt");
            fileOutputStream.write('你');
            String a= "java好";
            byte[] bytes = a.getBytes();
            fileOutputStream.write(bytes,0,bytes.length);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
