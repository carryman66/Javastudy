package com.carryman.file_.test;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author carry man
 * @version 1.0
 */
public class FileTest {
    @Test
    public void test(){
        File file = new File("C:\\Users\\carryman\\Desktop\\新建文件夹\\Java基础代码\\Javastudy\\src");
        String[] list = file.list();
        for (String o : list) {
            System.out.println(o);
        }

    }
    @Test
    public void test2(){
        File file = new File("C:\\Users\\carryman\\Desktop\\新建文件夹\\Java基础代码\\Javastudy\\src");
        File[] files = file.listFiles();

        for (File file1: files) {
            System.out.println(file1.getName());
        }

    }
    @Test
    public void test3() throws IOException {
        File file = new File("");
        System.out.println(file.getCanonicalPath());
    }

}
