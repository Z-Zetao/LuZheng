package com.Exception;

/**
 * @author 51465
 */
public class ExceptionTest04 {
    public static void main(String[] args) {
        Student student = new Student();
        try {
            student.setId(-1001);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Student{
    private int id;
    public void setId(int id) throws Exception {
        if (id > 0){
            this.id = id;
        }else {
            throw new Exception("您输入的参数异常！");
        }
    }
}
