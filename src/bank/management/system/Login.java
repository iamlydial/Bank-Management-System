package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    JLabel label1, label2, label3;


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

        label1  = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        label1.setBounds(230, 125, 450,40);
        add(label1);

        label2  = new JLabel("Card No: ");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Railway", Font.BOLD, 28));
        label2.setBounds(150, 190, 375,30);
        add(label2);

        label3  = new JLabel("PIN: ");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Railway", Font.BOLD, 28));
        label3.setBounds(150, 250, 375,30);
        add(label3);


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
