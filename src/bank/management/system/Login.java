package bank.management.system;

import bank.management.system.customfields.*;
import bank.management.system.factories.ButtonFactory;
import bank.management.system.factories.FieldLabelFactory;
import bank.management.system.factories.TextFieldFactory;
import bank.management.system.factories.TitleLabelFactory;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    CustomTitleLabel label1;
    CustomFieldLabel label2, label3;
    RoundedTextField roundedTextField1;
    RoundedPasswordField roundedPasswordField2;

    RoundedButton button1, button2, button3;


    Login(){
        super("Bank Management System");


        setLayout(null);
        setSize(850,480);
        setLocation(450,200);

        // Load an image resource using the system's class loader and create an ImageIcon from it
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        // Get the image from the ImageIcon and scale it to 100x100 pixels, maintaining the default scaling quality
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        // Create a new ImageIcon from the scaled image
        ImageIcon i3 = new ImageIcon(i2);
        // Create a JLabel to display the ImageIcon
        JLabel image = new JLabel(i3);
        // Set the position and size of the JLabel on the container (x = 350, y = 10, width = 100, height = 100)
        image.setBounds(350, 10, 100, 100);
        // Add the JLabel with the image to the JFrame container
        add(image);


        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630, 350, 100, 100);
        add(iimage);

        label1  = TitleLabelFactory.createTitleLabel("FANT-ATM", 300, 125, 450,40);
        add(label1);

        label2  = FieldLabelFactory.createTitleLabel("Card No: ", 300, 170, 375,30);
        add(label2);

        roundedTextField1 = TextFieldFactory.createRoundedTextField(10);
        roundedTextField1.setBounds(300, 200, 220, 30);
        add(roundedTextField1);

        label3 = FieldLabelFactory.createTitleLabel("PIN: ", 300, 240, 375,30);
        add(label3);

        roundedPasswordField2 = TextFieldFactory.createRoundedPasswordField(10);
        roundedPasswordField2.setBounds(300, 270, 220, 30);
        add(roundedPasswordField2);

        button1 = ButtonFactory.createDefaultRoundedButton("SIGN IN", 300, 320, 100, 30);
        add(button1);
        button2 = ButtonFactory.createDefaultRoundedButton("CLEAR", 420, 320, 100, 30);
        add(button2);

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0, 0, 850, 480);
        add(iiimage);

        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
