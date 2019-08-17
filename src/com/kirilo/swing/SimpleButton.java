package com.kirilo.swing;

import javax.swing.*;

public class SimpleButton extends JButton {
    public SimpleButton(String text) {
        super(text);
    }

    public SimpleButton(String title, int width, int height) {
        this(title);
        super.setSize(width, height);
    }
}
