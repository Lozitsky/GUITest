package com.kirilo.swing;

import com.kirilo.swing.calc.CalcOperations;
import com.kirilo.swing.component.*;
import com.kirilo.swing.listeners.ButtonListener;
import com.kirilo.swing.listeners.FieldFocusListener;

import javax.swing.*;
import java.awt.*;

public class Calculator {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField resultField;
    private ButtonListener buttonListener;

    private JPanel createNumberPanel() {
        JPanel panel = basePanel("numbers");
        panel.add(new SimpleJLabel("Number 1:"));
        textField1 = getTextField(10);
        panel.add(textField1);
        panel.add(new SimpleJLabel("Number 2:"));
        textField2 = getTextField(10);
        panel.add(textField2);
        return panel;
    }

    private JTextField getTextField(int columns) {
        JTextField textField = new SimpleJTextField(CalcOperations.INPUT_NUMBER, columns);
//        FieldFocusListener fieldFocusListener = new FieldFocusListener(textField);
        textField.addFocusListener(new FieldFocusListener(textField));
        return textField;
    }

    private JPanel createButtonPanel() {
        JPanel panel = basePanel("buttons");
        buttonListener = new ButtonListener(textField1, textField2, resultField);
        panel.add(getSimpleJButton("addition"));
        panel.add(getSimpleJButton("subtraction"));
        panel.add(getSimpleJButton("multiplication"));
        panel.add(getSimpleJButton("division"));
        return panel;
    }


    private JButton getSimpleJButton(String action) {
        JButton button = new SimpleJButton(action);
        button.addActionListener(buttonListener);
        return button;
    }

    private JPanel createResultPanel() {
        JPanel panel = basePanel("result");
        panel.add(new SimpleJLabel("Result:"));
        resultField = getResultField(15, Color.RED, false);
        panel.add(resultField);
        return panel;
    }

    public JFrame createFrame() {
        SimpleJFrame frame = new SimpleJFrame("Calculator", 430, 200, new BorderLayout(5, 5));
        frame.setMinimumSize(new Dimension(430, 200));
        frame.setResizable(false);
        frame.add(createResultPanel(), BorderLayout.SOUTH);
        frame.add(createNumberPanel(), BorderLayout.NORTH);
        frame.add(createButtonPanel(), BorderLayout.CENTER);
        frame.setVisible(true);
        return frame;
    }

    private JTextField getResultField(int column, Color color, boolean isEditable) {
        SimpleJTextField textField = new SimpleJTextField(column, color);
        textField.setEditable(isEditable);
        textField.setFocusable(isEditable);
        return textField;
    }

    private JPanel basePanel(String name) {
        JPanel panel = new SimpleJPanel(name, 100, 100);
        panel.setPreferredSize(new Dimension(200, 50));
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        return panel;
    }
}
