package com.kirilo.swing;

public class MainGUI {
    public static void main(String[] args) {
        SimpleButton button = new SimpleButton("Button");
        SimpleJPanel panel = new SimpleJPanel("Panel", 100, 100, button);
        SimpleJFrame frame = new SimpleJFrame("Frame", 200, 200, panel);
    }
}
