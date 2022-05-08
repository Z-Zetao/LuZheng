package com.oop.practice;

import static java.lang.Math.random;

/**
 * @author 51465
 */
public class ArrayTest {
    public static void main(String[] args) {
        //创建20个学生对象
        Student[] student = new Student[20];
        for (int i = 0; i < student.length; i++) {
            student[i] = new Student();
            student[i].number = i + 1;
            student[i].state = (int) (random() * 6 + 1);
            student[i].score = (int) (random() * 100 + 1);
        }

        //打印三年级的学生的信息
        for (int i = 0; i < student.length; i++) {
            if (student[i].state == 3) {
                System.out.println("学号为" + student[i].number
                        + "的学生年纪为" + student[i].state
                        + ",其考试成绩为：" + student[i].score);
            }
        }
    }

}

class Student{
    int number;
    int state;
    int score;
}
