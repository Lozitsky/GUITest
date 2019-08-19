package com.kirilo.swing.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChangeSkinListener implements ActionListener {

    private LookAndFeel lookAndFeel;
    private JFrame frame;

    public ChangeSkinListener(LookAndFeel lookAndFeel, JFrame frame) {
        this.lookAndFeel = lookAndFeel;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            UIManager.setLookAndFeel(lookAndFeel);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ChangeSkinListener.class.getName()).log(Level.SEVERE, null, ex);
        }
        SwingUtilities.updateComponentTreeUI(frame);
    }
}
