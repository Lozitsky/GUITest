package com.kirilo.swing;

import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;

import javax.swing.*;

public class TestGUI {
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        try {
            UIManager.setLookAndFeel(new AluminiumLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        new Calculator().createFrame();
    }
}
