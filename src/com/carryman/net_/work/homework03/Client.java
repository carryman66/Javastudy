package com.carryman.net_.work.homework03;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @author carry man
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

        Scanner scanner = new Scanner(System.in);

        System.out.println("输入您要下载的名称（高山流水）");
        String next = scanner.next();

        OutputStream outputStream = socket.getOutputStream();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

        bufferedWriter.write(next);
        bufferedWriter.flush();
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();


        byte[] bytes1 = StreamUtils.streamToByteArray(inputStream);

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("d:\\新建文件夹\\高山流水.jpg"));

        bufferedOutputStream.write(bytes1);



        bufferedOutputStream.close();
        inputStream.close();
        bufferedWriter.close();
        socket.close();



    }
}
