package com.carryman.io_.inputstream.fileinputstream;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author carry man
 * @version 1.0
 */
public class FileInputStreamTest {


    @Test
    public void readFile01() {
        FileInputStream fileInputStream = null;
        int readDate = 0;
        try {
            fileInputStream = new FileInputStream("d://1.txt");

            //一次读取一个字节
            while ((readDate = fileInputStream.read()) != -1) {
                System.out.println((char) readDate);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    @Test
    public void readFile02() {
        FileInputStream fileInputStream = null;
        //一次读取的长度
        int readOne = 0;
        byte[] bytes = new byte[8];

        try {
            fileInputStream = new FileInputStream("d://1.txt");

            //一次读取指定的字节长度，用数组存放
            while ((readOne = fileInputStream.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, readOne));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    @Test
    public void newReadFile() throws IOException {
        //使用新的try(resource)，自动回收资源
        //使用文件字节输入流测试
        int a = 0;
        int count = 0;
        try (FileInputStream fileInputStream = new FileInputStream("d:\\1.txt");) {
            while ((a = fileInputStream.read()) != -1) {
                System.out.println((char) a);
                count++;

            }
            System.out.println(count);
        }
    }


    @Test
    public void appendFileTest() throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream("d:\\3.txt", true)) {
            fileOutputStream.write('a');
        }
    }

    @Test
    public void classPathTest() throws IOException {
        byte[] bytes = new byte[8];
        int readOne = 0;
        try (InputStream inputStream = getClass().getResourceAsStream("/resource/default.properties")) {

            while ((readOne = inputStream.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, readOne));
            }
        }


    }

    @Test
    public void readChar() throws IOException {
        try (Reader reader = new FileReader("d:\\4.txt");) {
            int a = 0;
            while ((a = reader.read()) != -1) {
                System.out.println((char) a);
            }
        }
    }

    /**
     * 文件拷贝
     */
    @Test
    public void copy() throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream("d:\\t01.jpg"); FileOutputStream fileOutputStream = new FileOutputStream("d:\\新建文件夹\\1.jpg")) {
            byte[] bytes = new byte[128];
            int num = 0;
            while ((num=fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes,0,num);
            }
            System.out.println("复制成功");
        }

    }
}


