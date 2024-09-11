package bank.management.system.customfields;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RoundedButton extends JButton {
    private int radius;
    private Color hoverBgColor; // Background color on hover
    private Color defaultBgColor; // Default background color
    private boolean isHovered; // Track hover state

    // Constructor with all parameters
    public RoundedButton(String text, int radius, Font font, Color bgColor, Color fgColor, Color hoverBgColor, int x, int y, int width, int height) {
        super(text);
        this.radius = radius;
        this.defaultBgColor = bgColor;
        this.hoverBgColor = hoverBgColor;
        setOpaque(false); // Custom painting requires this
        setFont(font);
        setBackground(defaultBgColor);
        setForeground(fgColor);
        setBounds(x, y, width, height);
        setFocusPainted(false); // Set to false to remove default focus painting
        setBorder(BorderFactory.createEmptyBorder()); // Remove default border
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // Set cursor on hover

        // Add mouse listener to change cursor and background color on hover
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                isHovered = true;
                setBackground(hoverBgColor);
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                isHovered = false;
                setBackground(defaultBgColor);
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        // Call super.paintComponent before custom painting
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Background color
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);

        // Draw text
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        // Remove any default border painting
    }
}
