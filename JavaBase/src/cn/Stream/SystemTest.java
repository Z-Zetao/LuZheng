package cn.Stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 将输入的字符转换成大写输出
 * 当输入e或exit时退出
 *
 * @author 51465
 */
public class SystemTest {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            bufferedReader = new BufferedReader(inputStreamReader);
            while (true){
                String s = bufferedReader.readLine();
                if (s.equalsIgnoreCase("e") || s.equalsIgnoreCase("exit")){
                    break;
                }
                String sUpper = s.toUpperCase();
                System.out.println(sUpper);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}