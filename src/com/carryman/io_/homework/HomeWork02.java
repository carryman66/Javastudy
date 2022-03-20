package com.carryman.io_.homework;

import java.io.*;

/**
 * @author carry man
 * @version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new FileReader("e:\\mytemp\\hello.txt"));

        InputStreamReader gbk = new InputStreamReader(new FileInputStream("E:\\mytemp\\hello.txt"), "gbk");
        BufferedReader bufferedReader = new BufferedReader(gbk);



            String line = "";
        int countLine = 0;
        while ((line=bufferedReader.readLine())!=null){
            System.out.print(++countLine+" ");
            System.out.println(line);
        }


            gbk.close();
    }
}
