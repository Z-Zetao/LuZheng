package com.String;

/**
 * @author 51465
 */
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("abc");
        stringBuffer.append(1);//添加数据
        stringBuffer.delete(0,1);//删除数据
        stringBuffer.replace(0,1,"sd");//替换数据
        stringBuffer.insert(1,"b");//在某个位置插入数据
        stringBuffer.reverse();//将字符串反转
        stringBuffer.substring(0,2);//返回指定位置的字符串
        System.out.println(stringBuffer);
    }
}
