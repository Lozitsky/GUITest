package com.kirilo.swing;

import com.kirilo.swing.component.*;

import javax.swing.*;
import java.awt.*;

public class Calculator {
    private JPanel createNumberPanel() {
        JPanel panel = basePanel("numbers");
        panel.add(new SimpleJLabel("Number 1:"));
        panel.add(new JTextField(10));
        panel.add(new SimpleJLabel("Number 2:"));
        panel.add(new JTextField(10));
        return panel;
    }

    private JPanel createButtonPanel() {
        JPanel panel = basePanel("buttons");
        panel.add(new SimpleJButton("addition"));
        panel.add(new SimpleJButton("subtraction"));
        panel.add(new SimpleJButton("multiplication"));
        panel.add(new SimpleJButton("division"));
        return panel;
    }

    private JPanel createResultPanel() {
        JPanel panel = basePanel("result");
        panel.add(new SimpleJLabel("Result:"));
        panel.add(getResultField(15, Color.RED, false));
        return panel;
    }

    public JFrame createFrame() {
        SimpleJFrame frame = new SimpleJFrame("Calculatot", 430, 200, new BorderLayout(5, 5));
        frame.setMinimumSize(new Dimension(430, 200));
        frame.setResizable(false);
        frame.add(createNumberPanel(), BorderLayout.NORTH);
        frame.add(createButtonPanel(), BorderLayout.CENTER);
        frame.add(createResultPanel(), BorderLayout.SOUTH);
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
