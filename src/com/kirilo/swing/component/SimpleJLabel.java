package com.kirilo.swing.component;

import javax.swing.*;

public class SimpleJLabel extends JLabel {
    public SimpleJLabel(String text) {
        super(text);
    }

    public SimpleJLabel(String text, int width, int height) {
        this(text);
        super.setSize(width, height);
    }
}
