package com.carryman.io_.objectoutputstream;

import com.carryman.io_.pojo.Dog;
import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author carry man
 * @version 1.0
 */
public class ObjectOutPutStreamTest {
    @Test
    public void writeObject() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("d:\\1001.dat"));

        objectOutputStream.writeInt(1);
        objectOutputStream.writeBoolean(true);
        objectOutputStream.writeChar('a');
        objectOutputStream.writeDouble(9.4);
        objectOutputStream.writeUTF("序列化对象");

        objectOutputStream.writeObject(new Dog(1,"金毛"));
        objectOutputStream.close();

    }


}
