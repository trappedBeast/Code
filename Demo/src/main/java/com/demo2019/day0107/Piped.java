package com.demo2019.day0107;



import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @ClassName Piped
 * @Auther trappedBeast
 * @Date 2019/1/7 10:42
 * @Version 1.0
 * @Description TODO
 **/
public class Piped {
    public static void main(String[] args) throws IOException {
        Send send=new Send();
        Receive receive = new Receive();
        send.getOutput().connect(receive.getInput());
        new Thread(send).start();
        new Thread(receive).start();

    }
}


class Send implements Runnable{//发送数据的线程
    private PipedOutputStream output=null;
    public Send() {
        this.output = new PipedOutputStream();
    }



    public PipedOutputStream getOutput(){
        return this.output;
    }

    @Override
    public void run() {
        String str="hello world";//要发送的数据
        try {
            this.output.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                this.output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

class Receive implements Runnable{//接收数据的线程
    private PipedInputStream input;
    public Receive() {
        this.input = new PipedInputStream();
    }

    public PipedInputStream getInput(){
        return this.input;
    }

    @Override
    public void run() {
        byte [] bytes=new byte[1024];//接受数据
        int len=0;
        try {
            len=this.input.read(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(new String(bytes,0,len));

    }
}