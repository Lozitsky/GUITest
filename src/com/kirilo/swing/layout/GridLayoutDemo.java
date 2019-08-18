package com.kirilo.swing.layout;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends LayoutDefaultButtons {
    @Override
    protected void useLayout(JPanel panel) {
        panel.setLayout(new GridLayout(0,4,10,10));
    }
}
