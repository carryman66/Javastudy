package com.carryman.net_.socket.udp;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author carry man
 * @version 1.0
 */
public class B {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9998);


        String message="明天去玩吗";
        byte[] bytes = message.getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(bytes,0,bytes.length,InetAddress.getByName("192.168.0.100"),9999);
        //发送
        datagramSocket.send(datagramPacket);


        //接收
        byte[] msg= new byte[1024];
        datagramPacket=new DatagramPacket(msg,msg.length);


        datagramSocket.receive(datagramPacket);

        byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();

        System.out.println(new String(data,0,length));


        datagramSocket.close();
    }
}
