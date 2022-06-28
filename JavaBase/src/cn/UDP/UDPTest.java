package cn.UDP;

import org.junit.Test;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

/**
 * @author 51465
 */
public class UDPTest {
    @Test
    public void sender() {
        DatagramSocket socket = null;
        try {
            //1.创建socket对象
            socket = new DatagramSocket();
            //2.创建要传输的数据报
            String str = "我是UDP方式发送的导弹";
            byte[] data = str.getBytes();
            InetAddress inet = InetAddress.getLocalHost();
            DatagramPacket packet = new DatagramPacket(data, 0, data.length, inet, 9090);
            //3.传输数据
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null){
                //4.资源关闭
                socket.close();
            }
        }
    }
    @Test
    public void receiver() {
        DatagramSocket socket = null;
        try {
            //1.创建socket对象
            socket = new DatagramSocket(9090);
            //2.创建接收的数据报
            byte[] buffer = new byte[100];
            DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length);
            //3.接收数据
            socket.receive(packet);
            System.out.println(new String(packet.getData(), 0, packet.getLength()));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null){
                //4.资源关闭
                socket.close();
            }
        }
    }
}
