package bank.management.system.customfields;

import javax.swing.*;
import java.awt.*;

/**
 * CustomFieldLabel is a custom class that extends JLabel to provide
 * additional styling and positioning capabilities.
 */
public class CustomFieldLabel extends JLabel {

    /**
     * Constructs a CustomFieldLabel with specified properties.
     *
     * @param text   The text to be displayed on the label.
     * @param color  The color of the text.
     * @param font   The font used for the text.
     * @param x      The x-coordinate for the label's position.
     * @param y      The y-coordinate for the label's position.
     * @param width  The width of the label.
     * @param height The height of the label.
     */
    public CustomFieldLabel(String text, Color color, Font font, int x, int y, int width, int height) {
        super(text); // Set the text for the label
        setForeground(color); // Set the text color
        setFont(font); // Set the font style and size
        setBounds(x, y, width, height); // Set the position and size of the label
    }
}
