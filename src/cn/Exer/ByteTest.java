package cn.Exer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 读取目标文件，然后计算文件中出现的每个字符的次数
 * - 用Map < Object, Integer >
 *
 *
 * @author 51465
 */
public class ByteTest {
    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            //1.创建一个Map
            HashMap<Object, Integer> objectIntegerHashMap = new HashMap<>();
            //2.读取文件和写出文件
            File fileInput = new File("D:\\IntelliJ IDEA\\LuZheng\\src\\cn\\Hello.txt");
            File fileOutput = new File("D:\\IntelliJ IDEA\\LuZheng\\src\\cn\\HelloOutput.txt");
            //3.创建读取流
            fileReader = new FileReader(fileInput);
            fileWriter = new FileWriter(fileOutput);
            //4.读取数据
            int read = fileReader.read();
            while (read != -1){
                if (!objectIntegerHashMap.containsKey((char) read)){
                    objectIntegerHashMap.put((char) read,1);
                }else {
                    objectIntegerHashMap.put((char) read, objectIntegerHashMap.get((char) read) + 1);
                }
                read = fileReader.read();
            }
            //5.输入到文件中——遍历HashMap再写入文件中
            Set<Map.Entry<Object, Integer>> entries = objectIntegerHashMap.entrySet();
            for (Map.Entry<Object, Integer> entry : entries) {
                fileWriter.write(entry.getKey() + "=" + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //6.关闭资源
            if (fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
