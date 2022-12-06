package GUI;

import javax.swing.*;
import java.awt.*;

/*
 * JFrame (主窗体)
 * JDialog (对话框)
 * JPanel (面板)
 */

public class basicUnits {
    public static void main(String[] args) {


        HelloWorld gui = new HelloWorld();
        gui.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        gui.setSize(800, 600);//设置窗口大小
        gui.setVisible(true);//display the JFrame



    }
}

class HelloWorld extends JFrame{

    private JLabel label;

    public HelloWorld() {
        //窗体
        super("Our first Swing program");
        //Creates a new, initially invisible Frame with the specified title.
        //运行后title会出现在窗体的上方


        //在窗口内显示字
        setLayout(new FlowLayout());
        label = new JLabel("Hello World");
        label.setFont(new Font("San Serif", Font.PLAIN, 30));
        add(label);




    }
}
