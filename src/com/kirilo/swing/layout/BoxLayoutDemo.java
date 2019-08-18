package com.kirilo.swing.layout;

import javax.swing.*;

public class BoxLayoutDemo extends LayoutDefaultButtons {
    @Override
    protected void useLayout(JPanel panel) {
//        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
    }
}
