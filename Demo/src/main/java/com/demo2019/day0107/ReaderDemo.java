package com.demo2019.day0107;



import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @ClassName Reader
 * @Auther trappedBeast
 * @Date 2019/1/7 15:10
 * @Version 1.0
 * @Description TODO
 **/
public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("d:" + File.separator + "Father.txt");
        Reader reader=new FileReader(file);
        char [] chars=new char[(int) file.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i]= (char) reader.read();
        }
        System.out.println(new String(chars));



    }
}
