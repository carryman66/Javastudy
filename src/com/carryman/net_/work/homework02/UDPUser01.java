package com.carryman.net_.work.homework02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author carry man
 * @version 1.0
 */
public class UDPUser01 {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        String books = "红楼梦，水浒传，三国演义，西游记";
        //接收信息
        byte[] b = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(b, b.length);

        datagramSocket.receive(datagramPacket);

        byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();

        String s = new String(data, 0, length);
        //判断信息是什么
        if (s.equals("四大名著")) {
            datagramPacket = new DatagramPacket(books.getBytes(), books.getBytes().length, InetAddress.getByName("192.168.0.100"), 9998);

        } else {
            datagramPacket = new DatagramPacket("what?".getBytes(), "what?".getBytes().length, InetAddress.getByName("192.168.0.100"), 9998);
        }
        //发送信息
        datagramSocket.send(datagramPacket);

        //关闭管道
        datagramSocket.close();
        System.out.println("udp用户1关闭");


    }
}
