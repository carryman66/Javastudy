package com.carryman.net_.socket.filesocket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author carry man
 * @version 1.0
 */
public class FileSocketServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器端启动监听....");
        Socket accept = serverSocket.accept();

        InputStream inputStream = accept.getInputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);




        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("d:\\新建文件夹\\1.jpg"));

        bufferedOutputStream.write(bytes);


        OutputStream outputStream = accept.getOutputStream();
        BufferedOutputStream bufferedOutputStream1 = new BufferedOutputStream(outputStream);
        bufferedOutputStream1.write("服务器已经收到图片".getBytes(StandardCharsets.UTF_8));
        bufferedOutputStream1.flush();
        accept.shutdownOutput();
        bufferedOutputStream1.close();


        bufferedInputStream.close();
        bufferedOutputStream.close();
        accept.close();
        serverSocket.close();


    }
}
