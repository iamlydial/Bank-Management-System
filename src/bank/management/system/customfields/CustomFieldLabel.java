package bank.management.system.customfields;

import javax.swing.*;
import java.awt.*;

public class CustomFieldLabel extends JLabel {
    public CustomFieldLabel(String text, Color color, Font font, int x, int y, int width, int height) {
        super(text);
        setForeground(color);
        setFont(font);
        setBounds(x, y, width, height);
    }
}
