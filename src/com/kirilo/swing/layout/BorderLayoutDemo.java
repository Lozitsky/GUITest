package com.kirilo.swing.layout;

import com.kirilo.swing.component.SimpleJButton;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends LayoutDefaultButtons {
    private static String[] layouts = {BorderLayout.NORTH, BorderLayout.CENTER, BorderLayout.SOUTH, BorderLayout.WEST, BorderLayout.EAST};

    @Override
    protected void useLayout(JPanel panel) {
        panel.setLayout(new BorderLayout());
    }

    @Override
    protected void addButtonsToPanel(JPanel panel) {

        for (int i = 0; i < layouts.length; i++) {
            SimpleJButton button = new SimpleJButton("Button " + (i + 1));
            if (i == 2) {
                button.setPreferredSize(new Dimension(200, 200));
            }

            panel.add(button, layouts[i]);
        }
    }
}
