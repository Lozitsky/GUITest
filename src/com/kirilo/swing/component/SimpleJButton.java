package com.kirilo.swing.component;

import javax.swing.*;

public class SimpleJButton extends JButton {
    public SimpleJButton(String text) {
        super(text);
    }

    public SimpleJButton(String title, int width, int height) {
        this(title);
        super.setSize(width, height);
    }
}
