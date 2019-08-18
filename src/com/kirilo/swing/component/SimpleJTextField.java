package com.kirilo.swing.component;

import javax.swing.*;
import java.awt.*;

public class SimpleJTextField extends JTextField {
    public SimpleJTextField(int columns) {
        this(columns, Color.GRAY);
    }

    public SimpleJTextField(String text, int columns) {
        this(columns);
        super.setText(text);
    }

    public SimpleJTextField(int columns, Color textColor) {
        super(columns);
        Font font = new Font("Courier", Font.ITALIC, 12);
        super.setFont(font);
        super.setForeground(textColor);
    }
}
