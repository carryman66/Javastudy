package com.carryman.net_.socket.filesocket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author carry man
 * @version 1.0
 */
public class SocketClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端启动....");

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("d:\\1.jpg"));

        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);



        OutputStream outputStream = socket.getOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        bufferedOutputStream.write(bytes);

        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);
        inputStream.close();

        bufferedInputStream.close();
        bufferedOutputStream.close();
        socket.close();




    }
}
