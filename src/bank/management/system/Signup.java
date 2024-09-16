package bank.management.system;

import bank.management.system.customfields.CustomFieldLabel;
import bank.management.system.customfields.CustomTitleLabel;
import bank.management.system.factories.TitleLabelFactory;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Signup extends JFrame {
    Random ran = new Random();
    long first4 = (ran.nextLong()%9000L)+1000L;
    String first = " " + Math.abs(first4);
    Signup(){

        super("APPLICATION FORM");

        // Load an image resource using the system's class loader and create an ImageIcon from it
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        // Get the image from the ImageIcon and scale it to 100x100 pixels, maintaining the default scaling quality
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        // Create a new ImageIcon from the scaled image
        ImageIcon i3 = new ImageIcon(i2);
        // Create a JLabel to display the ImageIcon
        JLabel image = new JLabel(i3);
        // Set the position and size of the JLabel on the container (x = 350, y = 10, width = 100, height = 100)
        image.setBounds(25, 10, 100, 100);
        // Add the JLabel with the image to the JFrame container
        add(image);

        CustomTitleLabel label1 = TitleLabelFactory.createTitleLabelCustomColor("APPLICATION FORM NO." + first, Color.BLACK,160, 20, 600, 40);
        add(label1);

        CustomTitleLabel label2 = TitleLabelFactory.createTitleLabelCustomFontSize("Page 1", Color.BLACK, 22,380, 70, 600, 30);
        add(label2);

        CustomTitleLabel label3 = TitleLabelFactory.createTitleLabelCustomFontSize("Personal details", Color.BLACK, 22,330, 110, 600, 30);
        add(label3);

        getContentPane().setBackground(new Color(222,255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Signup();
    }
}
