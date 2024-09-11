package bank.management.system.factories;

import bank.management.system.customfields.CustomFieldLabel;
import bank.management.system.customfields.CustomTitleLabel;

import java.awt.*;

public class FieldLabelFactory {
    public static CustomFieldLabel createTitleLabel(String text, int x, int y, int width, int height) {
        return new CustomFieldLabel(text, Color.WHITE, new Font("Railway", Font.BOLD, 28), x, y, width, height);
    }
}
