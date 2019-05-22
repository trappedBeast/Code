package com.demo2019.day0107;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @ClassName WriterDemo
 * @Auther trappedBeast
 * @Date 2019/1/7 15:42
 * @Version 1.0
 * @Description TODO
 **/
public class WriterDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("d:" + File.separator + "Father.txt");
        Writer writer=new FileWriter(file,true);
        writer.write("changeing");
        writer.flush();
        //writer.close();
    }
}
    