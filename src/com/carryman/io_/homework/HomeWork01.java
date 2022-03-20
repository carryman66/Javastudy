package com.carryman.io_.homework;

import com.sun.xml.internal.ws.api.message.MessageWritable;

import java.io.*;

/**
 * @author carry man
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) throws IOException {
        File file = new File("e:\\mytemp");
        File file1 = new File(file + "\\hello.txt");
        if (!file.exists()){
            file.mkdir();
            file1.createNewFile();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));

            bufferedWriter.write("hello,word~");
            bufferedWriter.newLine();
            bufferedWriter.write("我们是中国队");
            bufferedWriter.close();
        }else {
            if (!file1.exists()){
                file1.createNewFile();
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
                bufferedWriter.write("hello,word~");
                bufferedWriter.close();
            }
            else {
                System.out.println("文件存在了");
            }

        }


    }
}
