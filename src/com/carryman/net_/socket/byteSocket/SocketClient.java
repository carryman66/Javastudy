package com.carryman.net_.socket.byteSocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

/**
 * @author carry man
 * @version 1.0
 */
public class SocketClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端连接成功" + socket.getClass());

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("客户端：hello，word".getBytes());
        socket.shutdownOutput();


        InputStream inputStream = socket.getInputStream();

        byte[] message = new byte[1024];
        int num = 0;

        while ((num = inputStream.read(message)) != -1) {
            System.out.println(new String(message, 0, num));
        }


        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
