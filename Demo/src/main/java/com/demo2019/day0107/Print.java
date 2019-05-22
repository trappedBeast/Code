package com.demo2019.day0107;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @ClassName Print
 * @Auther trappedBeast
 * @Date 2019/1/7 11:07
 * @Version 1.0
 * @Description TODO
 **/
public class Print {
    public static void main (String[] args) throws IOException {
        File file = new File("d:" + File.separator + "Father.txt");
        PrintStream out=new PrintStream(new FileOutputStream(file));
        out.println("1111");
        out.println("999999999");
        out.println(10);
        out.println('a');
        out.close();
    }
}
    