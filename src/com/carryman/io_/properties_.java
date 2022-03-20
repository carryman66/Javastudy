package com.carryman.io_;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author carry man
 * @version 1.0
 */
public class properties_ {
    @Test
    public void test() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("src\\resource\\default.properties"));
        properties.list(System.out);
        String name = properties.getProperty("name");
        String pass = properties.getProperty("pass");
        System.out.println(name+"==="+pass);



        //创建一个新的配置文件
        //在内存中
        Properties properties1 = new Properties();


        //文件没有就创建
        //有就修改
        properties1.setProperty("url","127.1.1.1");

        //存入文件

        properties1.store(new FileWriter("src/1.txt"),null);




    }
}
