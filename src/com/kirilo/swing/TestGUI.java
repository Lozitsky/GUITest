package com.kirilo.swing;

import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;

import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestGUI {
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        try {
            UIManager.setLookAndFeel(new AluminiumLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            Logger.getLogger(TestGUI.class.getName()).log(Level.SEVERE, null, e);
        }
        new Calculator().createFrame();
    }
}
