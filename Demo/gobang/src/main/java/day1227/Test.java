package day1227;

import javax.swing.JFrame;
import java.awt.*;


/**
 * @ClassName Test
 * @Auther trappedBeast
 * @Date 2018/12/27 18:29
 * @Version 1.0
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame();
        jFrame.setVisible(true);//设置窗体是否显示
        jFrame.setTitle("五子棋");//设置窗体标题
        jFrame.setSize(500,700);//设置窗体大小
        jFrame.setLocation(500,300);//设置初始位置
        jFrame.setResizable(false);//设置是否能更改大小
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Dimension defaultToolkit = Toolkit.getDefaultToolkit().getScreenSize();
        int width = defaultToolkit.width;
        int height = defaultToolkit.height;
        jFrame.setLocation((width-500)/2,(height-700)/2);



    }
}
    