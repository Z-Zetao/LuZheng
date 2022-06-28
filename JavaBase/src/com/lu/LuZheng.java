package com.lu;

//import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;


public class LuZheng {
    public static void main(String[] args) throws ParseException {
//        System.out.println("LuZheng");
//        System.out.println("zzt");
//        int c = add(3,4);
//        System.out.println(c);
//        System.out.println(Math.exp(1));

        //System.out.println(new Date());

//        Date dNow = new Date();
//        int year = dNow.getYear();
//        String simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd").format(dNow);
//        Date simpleDateFormat1 = new SimpleDateFormat("yyyyMMdd").parse(simpleDateFormat);
//        System.out.println(simpleDateFormat);
//        System.out.println(year);
//        Date date = new Date(1998-5-13);
//        System.out.println(date);
//        Calendar instance = Calendar.getInstance();
//        int i = instance.get(Calendar.YEAR);
//        System.out.println(i);
//        Date date = new Date(new java.util.Date().getTime());
//        System.out.println(date);

//        String a = "谷根逆糖粉吃法:  \n" +
//                "早餐（1号，2号谷根逆糖粉）\n" +
//                "午餐（1号谷根逆糖粉）\n" +
//                "晚餐（1号，3号谷根逆糖粉）\n" +
//                " \n" +
//                "维生素食用方法:\n" +
//                "维生素C  2片，每日三次；饭后嚼服\n" +
//                "维生素B  1片，每日三次；饭后吞服\n" +
//                "钙镁片    2片，每日三次；饭后吞服\n" +
//                " ";
//        System.out.println(a.length());

//        Integer test = new Scanner(System.in).nextInt();
//        if (test == null) {
//            System.out.println("test == null");
//        }else {
//            System.out.println("test != null");
//        }
//
//        Date date = new Date(System.currentTimeMillis());
//        System.out.println(date);

        int year = (new Date()).getYear();
        System.out.println("nizhenhaokan ");


    }

    public Integer setPatientAge(Date birthday) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(birthday);
        return instance.get(Calendar.YEAR);
    }

    public static int add(int a, int b){
        return a + b;
    }
}
