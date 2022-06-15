package cn.Stream;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author 51465
 */
public class RandomAccessFileTest {
    @Test
    public void test(){
        RandomAccessFile randomAccessFileInput = null;
        RandomAccessFile randomAccessFileOutput = null;
        try {
            randomAccessFileInput = new RandomAccessFile(
                    new File("D:\\IntelliJ IDEA\\LuZheng\\src\\cn\\Hot.jpg"), "r"
            );
            randomAccessFileOutput = new RandomAccessFile(
                    new File("D:\\IntelliJ IDEA\\LuZheng\\src\\cn\\HotOut.jpg"), "rw"
            );
            byte[] bytes = new byte[1024];
            int len;
            while((len = randomAccessFileInput.read()) != -1){
                randomAccessFileOutput.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (randomAccessFileInput != null){
                try {
                    randomAccessFileInput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (randomAccessFileOutput != null){
                try {
                    randomAccessFileOutput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
