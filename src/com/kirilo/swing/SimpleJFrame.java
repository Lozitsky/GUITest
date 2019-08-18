package com.kirilo.swing;

import javax.swing.*;
import java.awt.*;

public class SimpleJFrame extends JFrame {
    public SimpleJFrame(String title, int width, int height) throws HeadlessException {
        super.setName(title);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new FlowLayout());
        super.setVisible(true);
//        super.setIconImage(Toolkit.getDefaultToolkit().getImage("static/rr59vtxy.bmp"));
        super.setIconImage(new ImageIcon("static/avatar_generic_118.png").getImage());
    }

    public SimpleJFrame(String title, int width, int height, Component component) throws HeadlessException {
        this(title, width, height);
        super.getContentPane().add(component);
    }
}
