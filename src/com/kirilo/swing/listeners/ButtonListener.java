package com.kirilo.swing.listeners;

import com.kirilo.swing.calc.CalcOperations;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    private JPanel panel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField resultTextField;

    public ButtonListener(JPanel panel) {
        this.panel = panel;
    }

    public ButtonListener(JTextField textField1, JTextField textField2, JTextField resultTextField) {
        this.textField1 = textField1;
        this.textField2 = textField2;

        this.resultTextField = resultTextField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (!(source instanceof JButton)) {
            return;
        }
        JButton button = (JButton) source;
        double number1 = Double.parseDouble(textField1.getText());
        double number2 = Double.parseDouble(textField2.getText());
        String result = "";

        switch (button.getActionCommand()) {
            case "addition":
                result = String.valueOf(CalcOperations.addition(number1, number2));
                break;
            case "subtraction":
                result = String.valueOf(CalcOperations.subtraction(number1, number2));
                break;
            case "multiplication":
                result = String.valueOf(CalcOperations.multiplication(number1, number2));
                break;
            case "division":
                result = String.valueOf(CalcOperations.division(number1, number2));
                break;
            default:
//                resultTextField.setText(result);
        }
        resultTextField.setText(result);

//        JOptionPane.showMessageDialog(panel, "Pressed " + button != null ? button.getActionCommand().equalsIgnoreCase("button 3") ? "BUTTON 3!" : button.getText() : "button unknown!");
    }
}
