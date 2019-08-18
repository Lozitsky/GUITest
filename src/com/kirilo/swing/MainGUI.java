package com.kirilo.swing;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;

import javax.swing.*;

public class MainGUI {
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        try {
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            UIManager.setLookAndFeel(new AluminiumLookAndFeel());
/*        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();*/
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        SimpleButton button = new SimpleButton("Button");
        SimpleJPanel panel = new SimpleJPanel("Panel", 100, 100, button);
        SimpleJFrame frame = new SimpleJFrame("Frame", 200, 200, panel);
    }
}
