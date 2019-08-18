package com.kirilo.swing;

import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.kirilo.swing.layout.*;

import javax.swing.*;

public class TestLayout {
    public static void main(String[] args) {
//        JFrame.setDefaultLookAndFeelDecorated(true);
        try {
            UIManager.setLookAndFeel(new AluminiumLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
//        FlowLayout
//        new FlowLayoutDemo();
//        new BorderLayoutDemo();
//        new BoxLayoutDemo();
//        new GridLayoutDemo();
        new AbsoluteLayoutDemo();
    }
}
