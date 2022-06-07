package cn.Exer;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 51465
 */
public class PictureTest {
    //图片加密操作
    @Test
    public void test(){
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            //文件读取
            File fileIn = new File("D:\\IntelliJ IDEA\\LuZheng\\src\\cn\\Hot.jpg");
            //文件写出
            File fileOut = new File("D:\\IntelliJ IDEA\\LuZheng\\src\\cn\\HotSecret.jpg");
            //创建流——这个是图片文件，要用字符流
            fileInputStream = new FileInputStream(fileIn);
            fileOutputStream = new FileOutputStream(fileOut);
            //读取文件字节
            byte[] bytes = new byte[20];
            int len;
            while ((len = fileInputStream.read(bytes)) != -1){
                //对字节进行加密操作
                for (int i = 0; i < len; i++) {
                    bytes[i] = (byte) (bytes[i] ^ 5);
                }
                fileOutputStream.write(bytes, 0, len);
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
