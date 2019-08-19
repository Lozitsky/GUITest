package com.kirilo.swing.layout;

import com.kirilo.swing.component.SimpleJButton;
import com.kirilo.swing.listeners.ButtonListener;

import javax.swing.*;
import java.awt.*;

public class AbsoluteLayoutDemo extends LayoutDefaultButtons {
    private Component panel;

    @Override
    protected void useLayout(JPanel panel) {
        panel.setLayout(null);
    }

    @Override
    protected void addButtonsToPanel(JPanel panel) {
        this.panel = panel;
        ButtonListener buttonListener = new ButtonListener(panel);
        for (int i = 0; i < LayoutDemo.BUTTON_COUNT; i++) {
            SimpleJButton button = new SimpleJButton("Button " + (i + 1));
/*            button.addActionListener(e -> {
                JOptionPane.showMessageDialog(panel, "Pressed button");
            });*/

            button.addActionListener(buttonListener);
            button.setBounds(i * 35, 10 + i % 5 * 30, 170, 20);
            panel.add(button);
        }
    }

}
