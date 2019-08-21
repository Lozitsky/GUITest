package com.kirilo.swing;

import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.kirilo.swing.Calculator;
import com.kirilo.swing.TestGUI;

import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalcApplet extends JApplet {
    @Override
    public void init() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        try {
            UIManager.setLookAndFeel(new AluminiumLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            Logger.getLogger(TestGUI.class.getName()).log(Level.SEVERE, null, e);
        }
        new Calculator().createFrame();
    }
}
