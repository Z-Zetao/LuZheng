package com.DateTime;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 51465
 */
public class DateTimeTest {

    @Test
    public void test6(){
        Calendar calendar = Calendar.getInstance();
        //常用方法
        //get()：返回某些属性的值
        int i = calendar.get(Calendar.DAY_OF_MONTH);
        //set()：设置对象中的某些属性的值
        calendar.set(Calendar.DAY_OF_MONTH,27);
        //add()：往当前的某些属性值增加某些值
        calendar.add(Calendar.DAY_OF_MONTH,3);
        //getTime()：将日历类时间转换为Date类时间
        Date time = calendar.getTime();
        //setTime()：将Date类时间转换为日历类时间
        Date date = new Date();
        calendar.setTime(date);
    }

    @Test
    public void test5(){
        //解析
        String str = "22-5-27 上午11:43";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parse = simpleDateFormat.parse(str);
            System.out.println(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test4(){
        //SimpleDateFormat的实例化
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //格式化
        Date date = new Date();
        System.out.println(date);//Fri May 27 19:47:18 CST 2022
        String format = simpleDateFormat.format(date);
        System.out.println(format);//22-5-27 下午7:47
    }

    @Test
    public void test3(){
        java.sql.Date date = new java.sql.Date(1643564513465L);
        System.out.println(date);
        //怎么将util下的Date转换为sql下的Date对象
        Date date1 = new Date();
        java.sql.Date date2 = new java.sql.Date(date1.getTime());
        System.out.println(date2);
    }


    @Test
    public void test2(){
        //java.util.Date
        Date date = new Date();//获取当前时间的Date对象
        System.out.println(date);//相当于调用了toString()方法
        System.out.println(date.getTime());//获取当前date对象对应的时间戳
    }


    @Test
    public void test1(){
        //System.currentTimeMillis()——1970-01-01到现在的毫秒时间差
        long l = System.currentTimeMillis();
        System.out.println(l);
    }
}
