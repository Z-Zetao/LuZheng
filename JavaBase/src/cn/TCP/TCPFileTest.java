package cn.TCP;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 51465
 */
public class TCPFileTest {
    @Test
    public void client() {
        Socket socket = null;
        OutputStream outputStream = null;
        FileInputStream fileInputStream = null;
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            //1.造socket
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 9090);
            //2.造输出流
            outputStream = socket.getOutputStream();
            //读取文件
            fileInputStream = new FileInputStream(new File("D:\\IntelliJ IDEA\\LuZheng\\src\\cn\\TCP\\picture.jpeg"));
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fileInputStream.read(buffer)) != -1){
                outputStream.write(buffer, 0, len);
            }
            //read是个阻塞式方法，所以在传完一项时需要解除阻塞
            socket.shutdownOutput();
            //接受服务端传来的数据
            inputStream = socket.getInputStream();
            byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bufferOut = new byte[20];
            int lenOut;
            while ((lenOut = inputStream.read(bufferOut)) != -1){
                byteArrayOutputStream.write(bufferOut, 0, lenOut);
            }
            System.out.println(byteArrayOutputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null){
                try {
                    fileInputStream.close();
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
            if (socket != null){
                try {
                    socket.close();
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
    }

    @Test
    public void server() {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        OutputStream outputStream = null;
        try {
            //1.造一个ServerSocket
            serverSocket = new ServerSocket(9090);
            //2.造输入流
            socket = serverSocket.accept();
            //读取文件
            inputStream = socket.getInputStream();
            fileOutputStream = new FileOutputStream(new File("D:\\IntelliJ IDEA\\LuZheng\\src\\cn\\TCP\\schoolPicture.jpeg"));
            byte[] buffer = new byte[1024];
            int len;
            while ((len = inputStream.read(buffer)) != -1){
                fileOutputStream.write(buffer, 0, len);
            }
            //服务器端给予客户端反馈
            outputStream = socket.getOutputStream();
            outputStream.write("你好，照片我已收到！".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null){
                try {
                    fileOutputStream.close();
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
            if (socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (serverSocket != null){
                try {
                    serverSocket.close();
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
}
