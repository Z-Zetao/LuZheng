package com.Exception;

/**
 * @author 51465
 */
public class ExceptionTest01 {
    public static void main(String[] args) {
        String str = "abc";
        try {
            int num = Integer.parseInt(str);
        }catch (Exception e){
            System.out.println("出现数值转换异常！");
            System.out.println(e.getMessage());
        }
    }
}
