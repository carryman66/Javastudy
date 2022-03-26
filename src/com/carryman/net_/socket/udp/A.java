package com.carryman.net_.socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author carry man
 * @version 1.0
 */
public class A {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9999);

        int a= 1024;
        DatagramPacket datagramPacket = new DatagramPacket(new byte[a], a);


        //接收
        datagramSocket.receive(datagramPacket);

        byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();
        System.out.println(new String(data,0,length));


        //发送
        byte[] msg="好的，b".getBytes();

        datagramPacket=new DatagramPacket(msg,0,msg.length,InetAddress.getByName("192.168.0.100"),9998);
        datagramSocket.send(datagramPacket);

        datagramSocket.close();
    }
}
