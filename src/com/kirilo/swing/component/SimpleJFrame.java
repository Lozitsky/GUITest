package com.kirilo.swing.component;

import com.kirilo.swing.MainGUI;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class SimpleJFrame extends JFrame {

    public SimpleJFrame(String title, int width, int height) throws HeadlessException {
        super.setName(title);
        super.setMinimumSize(new Dimension(400, 400));
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        super.setIconImage(createImageIcon("/static/avatar_generic_118.png", "Icon").getImage());
    }

    public SimpleJFrame(String title, int width, int height, Component component) throws HeadlessException {
        this(title, width, height);
        super.getContentPane().add(component);
        super.setVisible(true);
    }

    public SimpleJFrame(String title, int width, int height, LayoutManager layoutManager) throws HeadlessException {
        this(title, width, height);
        super.setLayout(layoutManager);
        super.setVisible(true);
    }

    protected ImageIcon createImageIcon(String path,
                                        String description) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            ClassLoader cl = MainGUI.class.getClassLoader();
            URL resource = cl.getResource("static/avatar_generic_118.png");
            if (resource != null) {
                return new ImageIcon(resource);
            }
            return new ImageIcon();
        }
    }
}
