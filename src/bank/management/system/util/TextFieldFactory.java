package bank.management.system.util;

import bank.management.system.RoundedPasswordField;
import bank.management.system.RoundedTextField;
import java.awt.*;

public class TextFieldFactory {

    public static RoundedTextField createRoundedTextField(int radius) {
        return new RoundedTextField(radius, new Font("Arial", Font.BOLD, 14), Color.WHITE, Color.GRAY);
    }

    public static RoundedTextField createCustomRoundedTextField(int radius, Font font, Color bgColor, Color fgColor) {
        return new RoundedTextField(radius, font, bgColor, fgColor);
    }
    public static RoundedPasswordField createRoundedPasswordField(int radius) {
        return new RoundedPasswordField(radius, new Font("Arial", Font.BOLD, 14), Color.WHITE, Color.GRAY);
    }
}
