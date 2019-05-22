package com.demo.day1228;



import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @ClassName Send
 * @Auther trappedBeast
 * @Date 2018/12/28 15:39
 * @Version 1.0
 * @Description TODO
 **/

class Send implements Runnable {//发送数据的线程

    private PipedOutputStream output = null;

    public Send() {
        this.output = new PipedOutputStream();
    }

    public PipedOutputStream getPipedOutputStream() {
        return this.output;

    }

    @Override
    public void run() {
       String str="hello World";
        try {
            this.output.write(str.getBytes());
            this.output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

class Receive implements Runnable {
    private PipedInputStream input = null;

    public Receive() {
        this.input = new PipedInputStream();
    }

    public PipedInputStream getPipedInputStream() {
        return this.input;
    }

    @Override
    public void run() {
        byte bytes[] =new byte[1024];
        int len=0;
        try {
            len=this.input.read(bytes);
            this.input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(new String(bytes,0,len));

    }
}

public class ThreadConnectDemo {
    public static void main(String[] args) throws IOException {
        Send send=new Send();
        Receive receive=new Receive();
        send.getPipedOutputStream().connect(receive.getPipedInputStream());
        new Thread(send).start();
        new Thread(receive).start();


    }
}


    