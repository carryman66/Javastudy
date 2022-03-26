package com.carryman.net_.socket.byteSocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author carry man
 * @version 1.0
 */
public class SocketServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器端开启");
        Socket accept = serverSocket.accept();

        System.out.println("服务器端+"+accept.getClass());

        InputStream inputStream = accept.getInputStream();

        byte[] b= new byte[1024];
        int num= 0;
        while ((num=inputStream.read(b))!=-1){
            System.out.println(new String(b,0,num));
        }


        OutputStream outputStream = accept.getOutputStream();

        outputStream.write("helloClient".getBytes());
        accept.shutdownOutput();

        outputStream.close();


        inputStream.close();
        accept.close();
        serverSocket.close();

    }
}
