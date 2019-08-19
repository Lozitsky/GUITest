package com.kirilo.swing;

import com.jtattoo.plaf.aero.AeroLookAndFeel;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.kirilo.swing.calc.CalcOperations;
import com.kirilo.swing.component.*;
import com.kirilo.swing.listeners.ButtonListener;
import com.kirilo.swing.listeners.ChangeSkinListener;
import com.kirilo.swing.listeners.FieldFocusListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Calculator {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField resultField;

    //<editor-fold desc="Base elements">
    private JPanel getHorizontalPanel(String name) {
        JPanel panel = new SimpleJPanel(name, 100, 100);
        panel.setPreferredSize(new Dimension(200, 50));
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        return panel;
    }

    private JTextField getTextField(int columns) {
        JTextField textField = new SimpleJTextField(CalcOperations.INPUT_NUMBER, columns);
        textField.addFocusListener(new FieldFocusListener(textField));
        return textField;
    }


    private JButton getButton(String action, ActionListener listener) {
        JButton button = new SimpleJButton(action);
        button.addActionListener(listener);
        return button;
    }

    private JTextField getResultField(int column, Color color, boolean isEditable) {
        SimpleJTextField textField = new SimpleJTextField(column, color);
        textField.setEditable(isEditable);
        textField.setFocusable(isEditable);
        return textField;
    }
    //</editor-fold>

    //<editor-fold desc="Functional blocks">
    private JPanel createNumberPanel() {
        JPanel panel = getHorizontalPanel("numbers");
        panel.add(new SimpleJLabel("Number 1:"));
        textField1 = getTextField(10);
        panel.add(textField1);
        panel.add(new SimpleJLabel("Number 2:"));
        textField2 = getTextField(10);
        panel.add(textField2);
        return panel;
    }

    private JPanel createResultPanel(JFrame frame) {
        JPanel panel = getHorizontalPanel("result");
        panel.add(new SimpleJLabel("Result:"));
        resultField = getResultField(15, Color.RED, false);
        panel.add(resultField);
        panel.add(getButton("Skin1", new ChangeSkinListener(new AeroLookAndFeel(), frame)));
        panel.add(getButton("Skin2", new ChangeSkinListener(new AluminiumLookAndFeel(), frame)));
        return panel;
    }

    private JPanel createButtonPanel() {
        JPanel panel = getHorizontalPanel("buttons");
        ButtonListener buttonListener = new ButtonListener(textField1, textField2, resultField);
        panel.add(getButton("addition", buttonListener));
        panel.add(getButton("subtraction", buttonListener));
        panel.add(getButton("multiplication", buttonListener));
        panel.add(getButton("division", buttonListener));
        return panel;
    }

    public JFrame createFrame() {
        SimpleJFrame frame = new SimpleJFrame("Calculator", 430, 200, new BorderLayout(5, 5));
        frame.setMinimumSize(new Dimension(430, 200));
        frame.setResizable(false);
        frame.add(createNumberPanel(), BorderLayout.NORTH);
        frame.add(createResultPanel(frame), BorderLayout.SOUTH);
        frame.add(createButtonPanel(), BorderLayout.CENTER);
        frame.setVisible(true);
        return frame;
    }
    //</editor-fold>
}
