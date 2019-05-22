package com.demo2019.day0109;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

/**
 * @ClassName DateFormatTool
 * @Auther trappedBeast
 * @Date 2019/1/11 10:36
 * @Version 1.0
 * @Description 时间格式化工具类
 **/
public class DateFormatTool {
    private static Logger logger=Logger.getLogger("com.demo2019.day0109.DateFormatTool");

    /**
     * @Author trappedBeast
     * @Description 传入时间字符串和预想字符串格式，会得到按预想字符串格式化后的时间字符串
     * @Date 2019/1/11 10:52
     * @Param [dateStr：时间字符串, format：预想时间格式]
     * @return java.lang.String
     */
    public static String toFormat(String dateStr,String format) {
        /*logger.info("dateStr:"+dateStr);
        logger.info("format:"+format);*/
        String sourceFormat = DateFormatTool.getFormat(dateStr);//时间字符串源格式
        SimpleDateFormat strToDate = new SimpleDateFormat(sourceFormat);//String-Date
        SimpleDateFormat dateTostr = new SimpleDateFormat(format);//Date-String
        String newDate = null;
        try {
            Date parse = strToDate.parse(dateStr);
            newDate = dateTostr.format(parse);
        } catch (ParseException e) {
            logger.info(e+"时间格式解析异常");
        }
        return newDate;
    }

    /**
     * @Author trappedBeast
     * @Description 通过时间字符串获取该字符串的时间格式
     * @Date 2019/1/11 10:38
     * @Param [dateStr] 时间字符串
     * @return java.lang.String
     */
    public static String getFormat(String dateStr) {
        String format = "";// 时间格式字符串
        final String[] dateMark = {"y","M","d","H","m","s"};//时间格式标志
        int i = -1;
        for (int j = 0; j < dateMark.length; j++) {
            i++;
            for (i = i; i < dateStr.length(); i++) {
                if (i == dateStr.length()) {
                    return format;
                }
                String str = String.valueOf(dateStr.charAt(i));
                if (str.matches("^[0-9]*$")) {
                    format += dateMark[j];
                } else {
                    format += str;
                    break;
                }
            }
        }
        return format;
    }
}
    