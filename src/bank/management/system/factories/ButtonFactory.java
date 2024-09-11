package bank.management.system.factories;

import bank.management.system.customfields.RoundedButton;

import java.awt.*;

public class ButtonFactory {

    // Method to create a default rounded button with specified text and bounds
    // The hover color is set to light gray as default
    public static RoundedButton createDefaultRoundedButton(String text, int x, int y, int width, int height) {
        return new RoundedButton(text, 10, new Font("Roboto", Font.BOLD, 14), Color.MAGENTA, Color.WHITE, Color.BLUE, x, y, width, height);
    }


    // Method to create a custom rounded button with all properties specified
    public static RoundedButton createCustomRoundedButton(String text, int radius, Font font, Color bgColor, Color fgColor, Color hoverBgColor, int x, int y, int width, int height) {
        return new RoundedButton(text, radius, font, bgColor, fgColor, hoverBgColor, x, y, width, height);
    }

    // Optional method to create a custom rounded button with default settings for text and color
    public static RoundedButton createRoundedButtonWithDefaults(String text, int radius, Font font, Color bgColor, Color fgColor, Color hoverBgColor) {
        return new RoundedButton(text, radius, font, bgColor, fgColor, hoverBgColor, 0, 0, 100, 30); // Default bounds
    }
}
