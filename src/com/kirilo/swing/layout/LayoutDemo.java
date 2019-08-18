package com.kirilo.swing.layout;

import com.kirilo.swing.component.SimpleJFrame;
import com.kirilo.swing.component.SimpleJPanel;

import javax.swing.*;
import java.awt.*;

public abstract class LayoutDemo {

    public LayoutDemo() throws HeadlessException {
//        SimpleJPanel panel = new SimpleJPanel("Panel", 100, 100, button);
        SimpleJPanel panel = new SimpleJPanel();
        useLayout(panel);
        addButtonsToPanel(panel);
        SimpleJFrame frame = new SimpleJFrame("Frame", 500, 500, panel);
    }

    protected abstract void useLayout(JPanel panel);

    protected abstract void addButtonsToPanel(JPanel panel);

    protected static final int BUTTON_COUNT = 10;
}
