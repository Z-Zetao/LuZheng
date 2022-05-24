package com.Exception;

/**
 * @author 51465
 */
public class ExceptionTest03 {
    public static void main(String[] args) {
        try {
            ExceptionTest03 exceptionTest03 = new ExceptionTest03();
            exceptionTest03.throwsTest02();
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }finally {
            System.out.println("异常抛出！");
        }

    }

    public void throwsTest02() throws ArrayIndexOutOfBoundsException{
        throwsTest01();
    }

    public void throwsTest01() throws ArrayIndexOutOfBoundsException{
        int[] arr = new int[10];
        System.out.println(arr[10]);
    }
}
