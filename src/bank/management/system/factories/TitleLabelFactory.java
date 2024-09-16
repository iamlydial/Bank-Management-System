package bank.management.system.factories;

import bank.management.system.customfields.CustomTitleLabel;
import java.awt.*;

public class TitleLabelFactory {
    public static CustomTitleLabel createTitleLabel(String text, int x, int y, int width, int height) {
        return new CustomTitleLabel(text, Color.WHITE, new Font("AvantGarde", Font.BOLD, 38), x, y, width, height);
    }

    public static CustomTitleLabel createTitleLabelCustomColor(String text, Color color,  int x, int y, int width, int height) {
        return new CustomTitleLabel(text, color, new Font("AvantGarde", Font.BOLD, 38), x, y, width, height);
    }
}

