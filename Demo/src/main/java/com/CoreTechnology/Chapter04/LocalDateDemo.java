package com.CoreTechnology.Chapter04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;
import java.util.Date;

/**
 * @ClassName LocalDateDemo
 * @Auther trappedBeast
 * @Date 2018/11/15 11:02
 * @Version 1.0
 * @Description TODO
 **/
public class LocalDateDemo {
    public static void main(String[] args) {
        //Date 类很多方法都已经弃用
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd E day0401 HH:mm:ss");
        Date date = new Date();
        String format = dateFormat.format(date);
        System.out.println(format);
        System.out.println("===========================");

        //java.time包
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        TemporalField temporalField = ChronoField.DAY_OF_MONTH;
        System.out.println(localDate.get(temporalField));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMddhhmmss");
        String format1 = localDateTime.format(dateTimeFormatter);
        System.out.println(format1);

    }
}
    