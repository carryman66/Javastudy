package com.carryman.net_.work.homework02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @author carry man
 * @version 1.0
 */
public class UDPUser02 {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9998);

        //得到用户发送的信息
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入要问的:");
        String next = scanner.next();
        byte[] bytes = next.getBytes();
        //设置发送报内容
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.0.100"), 9999);
        //发送信息
        datagramSocket.send(datagramPacket);

        //接受信息，打印信息
        bytes = new byte[1024];
        datagramPacket = new DatagramPacket(bytes, bytes.length);
        datagramSocket.receive(datagramPacket);

        byte[] data = datagramPacket.getData();

        int length = datagramPacket.getLength();

        System.out.println(new String(data, 0, length));
        //关闭管道
        datagramSocket.close();
        System.out.println("udp用户2关闭");
    }
}
