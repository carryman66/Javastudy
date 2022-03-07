package com.carryman.commonclass.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;


/**
 * @author carry man
 * @version 1.0
 */
public class test {
    public static void main(String[] args) throws ParseException {

        //获取当前系统时间
        Date date = new Date();
        System.out.println(date);

        Date date1 = new Date(1643811742000L);

        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        String format1 = format.format(date);

        System.out.println("现在是"+format1);

        String a="2022年03月07日  08:54:25 周一";
        Date parse = format.parse(a);
        System.out.println(parse);


        String format2 = format.format(date1);
        System.out.println(format2);


        Calendar instance = Calendar.getInstance();
        int year = instance.get(Calendar.YEAR);
        int month = instance.get(Calendar.MONTH)+1;
        int day = instance.get(Calendar.DAY_OF_WEEK);
        int hour = instance.get(Calendar.HOUR_OF_DAY);
        int min = instance.get(Calendar.MINUTE);
        int sec = instance.get(Calendar.SECOND);

        System.out.println(year+"年"+month+"月"+day+"日"+hour+"时"+min+"分"+sec+"秒");


        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        int dayOfYear = now.getDayOfYear();
        System.out.println(dayOfYear);

        LocalDate now1 = LocalDate.now();
        System.out.println(now1);


        LocalTime now2 = LocalTime.now();
        System.out.println(now2);


        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时");
        String format3 = pattern.format(now);
        System.out.println(format3);

        Instant now3 = Instant.now();
        System.out.println(now3);
        Date from = Date.from(now3);

        System.out.println(from);

        Instant instant = from.toInstant();
        System.out.println(instant);


    }
}
