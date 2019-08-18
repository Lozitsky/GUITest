package com.kirilo.swing.layout;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends LayoutDefaultButtons {
    @Override
    protected void useLayout(JPanel panel) {
        panel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        //using by default
//        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
//        panel.setLayout(new FlowLayout());
//        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
    }
}
