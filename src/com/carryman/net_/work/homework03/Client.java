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

        //创建套接字，指定发送位置
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

        //接收用户输入
        Scanner scanner = new Scanner(System.in);

        System.out.println("输入您要下载的名称（高山流水）");
        String next = scanner.next();

        //创建套接字字节输出流
        OutputStream outputStream = socket.getOutputStream();

        //使用包装类，包装成字符输出流
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

        bufferedWriter.write(next);

        bufferedWriter.flush();
        //设置输出完成标志
        socket.shutdownOutput();

        //创建套接字字节输入流
        InputStream inputStream = socket.getInputStream();

        //将输入流中的字节，转为为字节数组
        byte[] bytes1 = StreamUtils.streamToByteArray(inputStream);
        //创建本地的包装缓存输出流，下载文件，写入磁盘
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("d:\\新建文件夹\\高山流水.jpg"));
        //写入磁盘
        bufferedOutputStream.write(bytes1);


        //关闭下载的流
        bufferedOutputStream.close();
        //关闭从服务器输入的流
        inputStream.close();
        //关闭输出流
        bufferedWriter.close();
        //关闭套接字
        socket.close();



    }
}
