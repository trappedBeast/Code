package com.CoreTechnology.Chapter06;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


/**
 * @ClassName TimePrint
 * @Auther trappedBeast
 * @Date 2018/11/22 18:20
 * @Version 1.0
 * @Description TODO
 **/
public class TimePrint implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("1111"+new Date());
        Toolkit.getDefaultToolkit().beep();

    }


}
    