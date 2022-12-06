package GUI;

import javax.swing.*;
import java.awt.*;

public class SwingCounter extends JFrame {

    private JTextField tfCount;

    private JButton btnCount;

    private int count = 0;

    public SwingCounter() {

        setLayout(new FlowLayout(FlowLayout.LEFT, 50, 0));

        add(new JLabel("Counter"));

        tfCount = new JTextField("0");

        tfCount.setEditable(false); add(tfCount);

        btnCount = new JButton("Count"); add(btnCount);
    }

    public static void main(String[] args) {
        SwingCounter sc = new SwingCounter();
    }
}

