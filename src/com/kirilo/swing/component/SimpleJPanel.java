package com.kirilo.swing.component;

import javax.swing.*;
import java.awt.*;

public class SimpleJPanel extends JPanel {
    public SimpleJPanel() {
    }

    public SimpleJPanel(String name, int width, int height) {
        super.setName(name);
        super.setSize(width, height);
        super.setBorder(BorderFactory.createEtchedBorder());
//        super.setBorder(BorderFactory.createLoweredBevelBorder());
    }

    public SimpleJPanel(String name, int width, int height, Component component) {
        this(name, width, height);
        super.add(component);
    }

    public SimpleJPanel(String name, int width, int height, LayoutManager layout) {
        this(name, width, height);
        super.setLayout(layout);
    }

    public SimpleJPanel(String name, int width, int height, LayoutManager layout, Component component) {
        this(name, width, height, layout);
        super.add(component);
    }
}
