package com.kirilo.swing.listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import static com.kirilo.swing.calc.CalcOperations.INPUT_NUMBER;

public class FieldFocusListener implements FocusListener {
    private JTextField textField;

    public FieldFocusListener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (textField.getText().trim().equalsIgnoreCase(INPUT_NUMBER)) {
            textField.setText("");
            textField.setForeground(Color.BLACK);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (textField.getText().trim().equalsIgnoreCase("")) {
            textField.setText(INPUT_NUMBER);
            textField.setForeground(Color.GRAY);
        }
    }
}
