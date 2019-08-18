package com.kirilo.swing.layout;

import com.kirilo.swing.component.SimpleJButton;

import javax.swing.*;
import java.awt.*;

public abstract class LayoutDefaultButtons extends LayoutDemo {
    @Override
    protected void addButtonsToPanel(JPanel panel) {

        for (int i = 0; i < LayoutDemo.BUTTON_COUNT; i++) {
            panel.add(new SimpleJButton("Button " + (i + 1)));
        }
    }
}
