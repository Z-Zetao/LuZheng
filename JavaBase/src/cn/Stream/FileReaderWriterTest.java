package cn.Stream;

import org.junit.Test;

import java.io.*;

/**
 * @author 51465
 */
public class FileReaderWriterTest {

    @Test
    public void testFileWriter() {
        //从内存中写出数据到硬盘的文件中
        FileWriter fileWriter = null;
        try {
            //1.提供File类的对象——指明写出到的文件
            File file = new File("D:\\IntelliJ IDEA\\LuZheng\\src\\cn\\Hello.txt");
            //2.提供FileWriter的对象，用于数据的写出
            fileWriter = new FileWriter(file,true);
            //3.写出的操作——把文件给覆盖掉了
            fileWriter.write("LuHuiXia have a boyfriend!\n");
            fileWriter.write("ZhengZeTao have a girlfriend!\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流资源的关闭
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testFileReader1() throws IOException {
        //1.File类的实例化
        File file = new File("D:\\IntelliJ IDEA\\LuZheng\\src\\cn\\Hello.txt");
        //2.FileReader流的实例化
        FileReader fileReader = new FileReader(file);
        //3.读入操作
        char[] chars = new char[5];
        int read = fileReader.read(chars);
        while (read != -1){
            for (int i = 0; i < read; i++) {
                System.out.print(chars[i]);
            }
            read = fileReader.read(chars);
        }
        //4.资源的关闭
        fileReader.close();
    }

    @Test
    public void testFileReader() {
        //将Hello.txt文件内容读取到程序中，并输出到控制台
        FileReader fileReader = null;
        try{
            //1.实例化File类的对象，指明要操作的文件
            File file = new File("D:\\IntelliJ IDEA\\LuZheng\\src\\cn\\Hello.txt");
            //2.提供具体的流
            fileReader = new FileReader(file);
            //3.数据的读入
            //read():返回读入的一个字符。如果达到文件末尾，则返回-1
            int read = fileReader.read();
            while (read != -1){
                System.out.print((char) read);
                read = fileReader.read();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //4.流的关闭操作
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
