package cn.TCP;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 客户端发送信息给服务端，服务端将数据显示在控制台上
 *
 * @author 51465
 */
public class TCPTest {
    /**
    * 客户端
     */
    @Test
    public void client() {
        Socket socket = null;
        OutputStream outputStream = null;
        try {
            //1.创建Socket对象，指明服务器端的ip和端口号
            InetAddress inet = InetAddress.getByName("192.168.222.1");
            //端口号必须是服务器的端口号
            socket = new Socket(inet, 8899);
            //将想要的数据往外输出
            //2.获取一个输出流，用于输出数据
            outputStream = socket.getOutputStream();
            //3.写出数据
            outputStream.write("你好，我是客户端".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭资源
            if (socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 服务端：接受来自客户端的数据
     */
    @Test
    public void server() {
        ServerSocket serverSocket = null;
        Socket accept = null;
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            //1.创建服务器端的ServerSocket，指明自己的端口号
            //端口号要给客户端
            serverSocket = new ServerSocket(8899);
            //2.调用accept()表示接收来自客户端的Socket
            accept = serverSocket.accept();
            //从客户端获取数据
            //3.获取输入流
            inputStream = accept.getInputStream();
            //下面这个是先将东西全都读出来，然后再转换为字符串
            //4.读取输入流中的数据
            byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] buffer = new byte[5];
            int len;
            while ((len = inputStream.read(buffer)) != -1){
                byteArrayOutputStream.write(buffer, 0, len);
            }
            System.out.println(byteArrayOutputStream.toString());
            System.out.println("收到来自" + accept.getInetAddress().getHostAddress() + "的数据");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5.关闭资源
            if (serverSocket != null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (accept != null){
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (byteArrayOutputStream != null){
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


//        byte[] buffer = new byte[20];
//        int len;
//        while ((len = inputStream.read()) != -1){
//            String s = new String(buffer, 0, len);
//            System.out.println(s);
//        }
    }
}
