package com.carryman.net_.work.homework;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author carry man
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("192.168.0.100", 9999);

        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入您的问题！");
        String s1 = scanner.nextLine();
        bufferedWriter.write(s1);
        bufferedWriter.flush();
        socket.shutdownOutput();


        InputStream inputStream = socket.getInputStream();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String s = bufferedReader.readLine();
        System.out.println(s);


        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
    }
}
