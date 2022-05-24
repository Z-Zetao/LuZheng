package com.Exception;

/**
 * @author 51465
 */
public class ExceptionTest02 {
    public static void main(String[] args) {
        ExceptionTest02 exceptionTest02 = new ExceptionTest02();
        int method = exceptionTest02.method();
        System.out.println(method);
    }


    public int method(){
        try {
            int[] arr = new int[10];
            System.out.println(arr[10]);
            return 1;
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            return 2;
        }finally {
            System.out.println("我一定会被执行的！");
        }
    }
}
