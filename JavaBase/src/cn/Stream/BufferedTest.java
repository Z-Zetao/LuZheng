package cn.Stream;

import org.junit.Test;

import java.io.*;

/**
 * @author 51465
 */
public class BufferedTest {

    @Test
    public void bufferedReaderWriterStreamTest(){
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            //创建流
            bufferedReader = new BufferedReader(
                    new FileReader(
                            new File("D:\\IntelliJ IDEA\\LuZheng\\src\\cn\\Hello.txt")));
            bufferedWriter = new BufferedWriter(
                    new FileWriter(
                            new File("D:\\IntelliJ IDEA\\LuZheng\\src\\cn\\HelloCopy.txt")));
//            //方式一：
//            //读写操作
//            char[] chars = new char[5];
//            int len;
//            while ((len = bufferedReader.read(chars)) != -1){
//                bufferedWriter.write(chars,0,len);
//            }
            //方式二：
            String data;
            while ((data = bufferedReader.readLine()) != null){
//                //方式二.一
//                //这个不包含换行符
//                bufferedWriter.write(data + "\n");
                //方式二.二
                bufferedWriter.write(data);
                bufferedWriter.newLine();//提供换行操作
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //资源流关闭
            if (bufferedReader != null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedWriter != null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void bufferedStreamTest(){
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            //1.造文件
            File srcFile = new File("D:\\IntelliJ IDEA\\LuZheng\\src\\cn\\Sheep.jpg");
            File descFile = new File("D:\\IntelliJ IDEA\\LuZheng\\src\\cn\\Mie.jpg");
            //2.造流
            //2.1 造字节流
            fileInputStream = new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(descFile);
            //2.2 造缓冲流
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            //3.复制的细节：读取、复制
            byte[] buffer = new byte[10];
            int len;
            while ((len = bufferedInputStream.read(buffer)) != -1){
                bufferedOutputStream.write(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流资源关闭——要先关闭外层的流资源，再关闭内层流资源
            //在关闭外层流资源的同时，内层流资源也会自动关闭
            if (bufferedInputStream != null){
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedOutputStream != null){
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
