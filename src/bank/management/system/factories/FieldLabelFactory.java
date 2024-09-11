package bank.management.system.factories;

import bank.management.system.customfields.CustomFieldLabel;

import java.awt.*;

/**
 * FieldLabelFactory is a factory class for creating instances of CustomFieldLabel.
 * This factory is used to encapsulate the creation logic for field labels.
 */
public class FieldLabelFactory {

    /**
     * Creates a CustomFieldLabel instance with predefined styles and position.
     *
     * @param text   The text to be displayed on the label.
     * @param x      The x-coordinate for the label's position.
     * @param y      The y-coordinate for the label's position.
     * @param width  The width of the label.
     * @param height The height of the label.
     * @return A CustomFieldLabel instance with the specified properties.
     */
    public static CustomFieldLabel createTitleLabel(String text, int x, int y, int width, int height) {
        // Create and return a CustomFieldLabel with predefined color, font, and position
        return new CustomFieldLabel(text, Color.WHITE, new Font("Railway", Font.BOLD, 28), x, y, width, height);
    }
}
