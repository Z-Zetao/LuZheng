package com.String;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Locale;

/**
 * @author 51465
 */
public class StringMethodTest {
    public static void main(String[] args) {
        String s1 = "helloWorld中国";
        //String转换为byte[]类型的数组——调用getBytes()方法
        byte[] bytes = s1.getBytes();//使用默认的字符集进行转换
        System.out.println(Arrays.toString(bytes));
        //byte[]类型数组转换为String——调用String构造器
        byte[] bytes1 = {104, 101, 108, 108, 111, 87, 111, 114, 108, 100, -28, -72, -83, -27, -101, -67};
        String s = new String(bytes1);
        System.out.println(s);
    }
}
