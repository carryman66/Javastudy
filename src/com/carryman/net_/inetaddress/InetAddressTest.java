package com.carryman.net_.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author carry man
 * @version 1.0
 */
public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        //获取本机的InetAddress对象

        InetAddress loopbackAddress = InetAddress.getLocalHost();
        System.out.println(loopbackAddress);

        InetAddress byName = InetAddress.getByName("baidu.cn");
        System.out.println(byName);

        String hostAddress = byName.getHostAddress();
        System.out.println(hostAddress);

        String hostName = byName.getHostName();
        System.out.println(hostName);
    }
}
