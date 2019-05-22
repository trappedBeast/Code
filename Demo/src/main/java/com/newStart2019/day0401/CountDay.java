package com.newStart2019.day0401;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @ClassName CountDay
 * @Auther trappedBeast
 * @Date 2019/4/1 9:47
 * @Version 1.0
 * @Description TODO
 **/
public class CountDay {
    public static int getMonthDiff(String d1, String d2) throws ParseException {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        //将String日期转换成date
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
        java.util.Date date1=sdf.parse(d1);
        java.util.Date date2=sdf.parse(d2);
        c1.setTime(date1);
        c2.setTime(date2);
        //判断两个日期的大小
        if(c2.getTimeInMillis() < c1.getTimeInMillis()) return 0;
        int year1 = c1.get(Calendar.YEAR);
        int year2 = c2.get(Calendar.YEAR);
        int month1 = c1.get(Calendar.MONTH);
        int month2 = c2.get(Calendar.MONTH);
        int day1 = c1.get(Calendar.DAY_OF_MONTH);
        int day2 = c2.get(Calendar.DAY_OF_MONTH);
        // 获取年的差值 假设 d1 = 2015-9-30   d2 = 2015-12-16
        int yearInterval = year2 - year1;
        // 如果 d1的 月-日 小于 d2的 月-日 那么 yearInterval-- 这样就得到了相差的年数
        if(month2 < month1 || month1 == month2 && day2 < day1) yearInterval --;
        // 获取月数差值
        int monthInterval = (month2 + 12) - month1 ;
        if(day2 > day1) monthInterval ++;
        monthInterval %= 12;
        return yearInterval * 12 + monthInterval;
    }

    public static void main(String[] args) throws ParseException {
        int monthDiff = getMonthDiff("20190201","20190301");
        System.out.println(monthDiff);
    }

}
    