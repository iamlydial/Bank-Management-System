package bank.management.system;

import bank.management.system.customfields.CustomFieldLabel;
import bank.management.system.customfields.CustomTitleLabel;
import bank.management.system.customfields.RoundedTextField;
import bank.management.system.factories.TextFieldFactory;
import bank.management.system.factories.TitleLabelFactory;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Signup extends JFrame {

    RoundedTextField fieldName, fieldLastname;
    JDateChooser dateChooser;
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

        CustomFieldLabel labelName = new CustomFieldLabel("Name",Color.BLACK, (new Font("Ralway", Font.BOLD, 20)), 100, 190, 100, 20);
        add(labelName);

        fieldName = TextFieldFactory.createCustomRoundedTextField(20,(new Font("Ralway", Font.BOLD, 14)), Color.WHITE, Color.BLACK );
        fieldName.setBounds(100, 240, 200, 30);
        add(fieldName);

        CustomFieldLabel labelLastName = new CustomFieldLabel("Last Name",Color.BLACK, (new Font("Ralway", Font.BOLD, 20)), 100, 290, 200, 20);
        add(labelLastName);

        fieldLastname = TextFieldFactory.createCustomRoundedTextField(20,(new Font("Ralway", Font.BOLD, 14)), Color.WHITE, Color.BLACK );
        fieldLastname.setBounds(100, 340, 200, 30);
        add(fieldLastname);

        CustomFieldLabel DOB = new CustomFieldLabel("Date of Birth",Color.BLACK, (new Font("Ralway", Font.BOLD, 20)), 100, 380, 200, 30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(100, 420, 200, 30);
        add(dateChooser);

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
