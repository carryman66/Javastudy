package com.carryman.net_.work.homework;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author carry man
 * @version 1.0
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);

        Socket accept = serverSocket.accept();

        InputStream inputStream = accept.getInputStream();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String s = bufferedReader.readLine();
        OutputStream outputStream = accept.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        if ("name".equals(s)){
        bufferedWriter.write("我是nova");
        }
        else if ("hobby".equals(s)){
            bufferedWriter.write("编写java程序");
        }
        else {
            bufferedWriter.write("你说啥呢");
        }

        bufferedWriter.flush();
        accept.shutdownOutput();
        bufferedWriter.close();
        bufferedReader.close();
        accept.close();
        serverSocket.close();
    }

}
