package com.demo2019.day0107;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName Append
 * @Auther trappedBeast
 * @Date 2019/1/7 14:25
 * @Version 1.0
 * @Description TODO
 **/
public class Append {
    public static void main(String[] args) throws IOException {
        File file = new File("d:" + File.separator + "Father.txt");
        /*OutputStream output=new FileOutputStream(file,true);
        String str="hello world\r\n";
        byte [] bytes=str.getBytes();
        for (byte abyte : bytes) {
            output.write(abyte);
        }
        output.close();*/


        InputStream input=null;
        input=new FileInputStream(file);
        byte [] bytes=new byte[(int) file.length()];
        for (int i = 0; i <bytes.length ; i++) {
            bytes[i] = (byte) input.read();
        }
        int len = input.read(bytes);
        System.out.println(new String(bytes));
    }
}
    