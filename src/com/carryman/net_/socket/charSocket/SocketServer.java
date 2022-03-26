package com.carryman.net_.socket.charSocket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author carry man
 * @version 1.0
 */
public class SocketServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket accept = serverSocket.accept();

        InputStream inputStream = accept.getInputStream();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String s = bufferedReader.readLine();
        System.out.println(s);

        OutputStream outputStream = accept.getOutputStream();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

        bufferedWriter.write("我是服务器端：￥@#￥@#%");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        bufferedWriter.close();
        bufferedReader.close();
        accept.close();
        serverSocket.close();


    }
}
