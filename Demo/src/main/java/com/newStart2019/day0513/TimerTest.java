package com.newStart2019.day0513;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

/**
 * @ClassName TimerTest
 * @Auther trappedBeast
 * @Date 2019/5/15 11:21
 * @Version 1.0
 * @Description TODO
 **/
public class TimerTest {
    public static void main(String[] args) {
        ActionListener action=new TimerPrint();
        Timer timer=new Timer(1000,action);
        timer.start();
        JOptionPane.showMessageDialog(null,"quit program");
        System.exit(0);

    }
}


class TimerPrint implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(""+ LocalDateTime.now());
        Toolkit.getDefaultToolkit().beep();
    }
}
    