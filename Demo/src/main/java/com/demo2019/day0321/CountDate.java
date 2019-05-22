package com.demo2019.day0321;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName CountDate
 * @Auther trappedBeast
 * @Date 2019/3/26 11:50
 * @Version 1.0
 * @Description TODO
 **/
public class CountDate {
    public static void main(String[] args) throws ParseException {
        System.out.println(CountDate.count("20190131","20190231"));
    }

    public static int count(String startDate,String endDate) throws ParseException {
        SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyyMMdd");
        Date fromDate1 = simpleFormat.parse(startDate);
        Date toDate1 = simpleFormat.parse(endDate);
        long from1 = fromDate1.getTime();
        long to1 = toDate1.getTime();
        int days = (int) ((to1 - from1) / (1000 * 60 * 60 * 24 * 30));
        System.out.println("两个时间之间的天数差为：" + days);
        return days;

    }
}
    