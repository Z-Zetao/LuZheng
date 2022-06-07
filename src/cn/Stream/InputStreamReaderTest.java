package cn.Stream;

import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author 51465
 */
public class InputStreamReaderTest {

    @Test
    public void test(){
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;
        try {
            File fileInput = new File("D:\\IntelliJ IDEA\\LuZheng\\src\\cn\\Hello.txt");
            File fileOutput = new File("D:\\IntelliJ IDEA\\LuZheng\\src\\cn\\HelloTransfer.txt");
            //创建字节流
            FileInputStream fileInputStream = new FileInputStream(fileInput);
            FileOutputStream fileOutputStream = new FileOutputStream(fileOutput);
            //创建缓冲流
            inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            outputStreamWriter = new OutputStreamWriter(fileOutputStream, "gbk");
            //处理数据
            char[] chars = new char[1024];
            int len;
            while ((len = inputStreamReader.read(chars)) != -1){
                outputStreamWriter.write(chars, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStreamWriter != null) {
                try {
                    outputStreamWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        InputStreamReader inputStreamReader = null;
        try {
            //读取文件并创建流
            FileInputStream fileInputStream = new FileInputStream("D:\\IntelliJ IDEA\\LuZheng\\src\\cn\\Hello.txt");
            //造一个缓冲流——不添加字符集时即为默认字符集
            inputStreamReader = new InputStreamReader(fileInputStream);
            //读到内存中
            char[] chars = new char[1024];
            int len;
            while ((len = inputStreamReader.read(chars)) != -1){
                String s = new String(chars, 0, len);
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStreamReader != null){
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
