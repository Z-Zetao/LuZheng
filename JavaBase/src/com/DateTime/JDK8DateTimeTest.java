package com.DateTime;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * @author 51465
 */
public class JDK8DateTimeTest {

    @Test
    public void test3(){
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //格式化：日期转换成字符串
        LocalDateTime localDateTime = LocalDateTime.now();
        String format = formatter.format(localDateTime);
        //解析：字符串转换为日期
        TemporalAccessor parse = formatter.parse("2022-05-27T21:40:14.373");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter formatter3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        //格式化
        String format1 = formatter1.format(localDateTime);//22-5-27 下午9:46
        String format2 = formatter2.format(localDateTime);//2022年5月27日 下午09时46分26秒
        String format3 = formatter3.format(localDateTime);//2022-5-27 21:46:26

        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String format4 = formatter4.format(localDateTime);
        TemporalAccessor parse1 = formatter1.parse("22-5-27 下午9:46");
        TemporalAccessor parse2 = formatter1.parse("2022年5月27日 下午09时46分26秒");
        TemporalAccessor parse3 = formatter1.parse("2022-5-27 21:46:26");
        System.out.println(format4);
    }

    @Test
    public void test2(){
        Instant instant = Instant.now();//获取0时区处的时间
        System.out.println(instant);//我们在东8区，所以时间会差8小时
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));//设置时间偏移量
        System.out.println(offsetDateTime);
        long l = instant.toEpochMilli();//获取当前时间的毫秒数————相较于1970-1-1 0:0:0
        Instant instant1 = Instant.ofEpochMilli(16878571235L);

    }

    //LocalDate、LocalTime、LocalDateTime的使用
    @Test
    public void test1(){
        //now()
        LocalDate localDate = LocalDate.now();//获取当前日期
        LocalTime localTime = LocalTime.now();//获取当前时间
        LocalDateTime localDateTime = LocalDateTime.now();//获取当前日期和时间
        //of():设置指定的年月日时分秒——没有偏移量
        LocalDateTime localDateTime1 = LocalDateTime.of(2022, 5, 27, 20, 57);
        System.out.println(localDateTime1);
        Month month = localDateTime.getMonth();
    }

}
