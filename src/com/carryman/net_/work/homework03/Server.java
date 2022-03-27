package com.carryman.net_.work.homework03;

import java.io.*;
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

        byte[] bytes;
        if ("高山流水".equals(s)) {

            bytes = StreamUtils.streamToByteArray(new BufferedInputStream(new FileInputStream("d:\\1.jpg")));


        } else {
            bytes = StreamUtils.streamToByteArray(new BufferedInputStream(new FileInputStream("d:\\2.jpg")));
        }
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write(bytes);
        outputStream.flush();
        accept.shutdownOutput();

        outputStream.close();
        bufferedReader.close();
        accept.close();
        serverSocket.close();

    }
}
