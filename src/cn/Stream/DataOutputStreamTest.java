package cn.Stream;

import org.junit.Test;

import java.io.*;

/**
 * @author 51465
 */
public class DataOutputStreamTest {
    @Test
    public void outputTest(){
        //将内存中的基本数据类型和字符串写入到文件中
        DataOutputStream dataOutputStream = null;
        try {
            dataOutputStream = new DataOutputStream(
                    new FileOutputStream("D:\\IntelliJ IDEA\\LuZheng\\src\\cn\\HelloData.txt"));
            dataOutputStream.writeUTF("郑泽涛");
            dataOutputStream.flush();
            dataOutputStream.writeInt(24);
            dataOutputStream.flush();
            dataOutputStream.writeBoolean(true);
            dataOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dataOutputStream != null){
                try {
                    dataOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void inputTest(){
        //将文件中存储的基本数据类型变量和字符串读取到内存文件中
        DataInputStream dataInputStream = null;
        String name = null;
        int age = 0;
        boolean isMale = false;
        try {
            dataInputStream = new DataInputStream(
                    new FileInputStream("D:\\IntelliJ IDEA\\LuZheng\\src\\cn\\HelloData.txt"));
            name = dataInputStream.readUTF();
            age = dataInputStream.readInt();
            isMale = dataInputStream.readBoolean();
            System.out.println("姓名:" + name);
            System.out.println("年龄:" + age);
            System.out.println("性别(true:♂ false:♀):" + isMale);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dataInputStream != null){
                try {
                    dataInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
