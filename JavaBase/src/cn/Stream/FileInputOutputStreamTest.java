package cn.Stream;

import org.junit.Test;

import java.io.*;

/**
 * @author 51465
 */
public class FileInputOutputStreamTest {

    @Test
    public void testFileInputOutputStream() {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            //实现对文件的复制操作
            File srcFile = new File("D:\\IntelliJ IDEA\\LuZheng\\src\\cn\\Hot.jpg");
            File descFile = new File("D:\\IntelliJ IDEA\\LuZheng\\src\\cn\\Sheep.jpg");
            //创建流
            fileInputStream = new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(descFile);
            //复制的过程
            byte[] buffer = new byte[5];
            int len;
            while ((len = fileInputStream.read(buffer)) != -1){
                fileOutputStream.write(buffer,0,len);
            }
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
            if (fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
