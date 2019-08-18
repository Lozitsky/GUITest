package com.kirilo.swing.layout;

import com.kirilo.swing.component.SimpleJButton;

import javax.swing.*;

public class AbsoluteLayoutDemo extends LayoutDefaultButtons {
    @Override
    protected void useLayout(JPanel panel) {
        panel.setLayout(null);
    }

    @Override
    protected void addButtonsToPanel(JPanel panel) {
        for (int i = 0; i < LayoutDemo.BUTTON_COUNT; i++) {
            SimpleJButton button = new SimpleJButton("Button " + (i + 1));
//            button.setSize(100, 100);
            button.setBounds(i * 35, 10 + i % 5 * 30, 170, 20);
            panel.add(button);
        }
    }
}
