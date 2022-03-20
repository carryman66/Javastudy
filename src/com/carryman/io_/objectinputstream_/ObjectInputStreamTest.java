package com.carryman.io_.objectinputstream_;

import com.carryman.io_.objectoutputstream.ObjectOutPutStreamTest;
import com.carryman.io_.pojo.Dog;
import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author carry man
 * @version 1.0
 */
public class ObjectInputStreamTest {
    @Test
    public void objectInputTest() throws IOException, ClassNotFoundException {

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("d:\\1001.dat"));) {
            Object o;
            System.out.println( inputStream.readInt());
            System.out.println( inputStream.readBoolean());
            System.out.println(inputStream.readChar());
            System.out.println(inputStream.readDouble());
            System.out.println(inputStream.readUTF());
            System.out.println(((Dog)inputStream.readObject()).getName());

        }
    }
}
