package cn.InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 51465
 */
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress inet1 = InetAddress.getByName("192.168.10.14");///192.168.10.14
            System.out.println(inet1);
            InetAddress inet2 = InetAddress.getByName("www.baidu.com");
            System.out.println(inet2);//www.baidu.com/14.215.177.38
            System.out.println(inet2.getHostAddress());//14.215.177.38
            System.out.println(inet2.getHostName());//www.baidu.com
            //获取本机IP地址
            InetAddress localHost = InetAddress.getLocalHost();//LAPTOP-2T0A5F3D/192.168.222.1
            System.out.println(localHost);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Inet的使用");
        }
    }
}