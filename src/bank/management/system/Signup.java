package bank.management.system;

import bank.management.system.customfields.CustomFieldLabel;
import bank.management.system.customfields.CustomTitleLabel;
import bank.management.system.customfields.RoundedButton;
import bank.management.system.customfields.RoundedTextField;
import bank.management.system.factories.ButtonFactory;
import bank.management.system.factories.TextFieldFactory;
import bank.management.system.factories.TitleLabelFactory;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JRadioButton r1, r2, married, unmarried, other;

    RoundedTextField fieldName, fieldLastname, fieldEmail, fieldAddress,fieldCity, fieldState;
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
        fieldName.setBounds(300, 190, 400, 30);
        add(fieldName);

        CustomFieldLabel labelLastName = new CustomFieldLabel("Last Name",Color.BLACK, (new Font("Ralway", Font.BOLD, 20)), 100, 240, 200, 20);
        add(labelLastName);

        fieldLastname = TextFieldFactory.createCustomRoundedTextField(20,(new Font("Ralway", Font.BOLD, 14)), Color.WHITE, Color.BLACK );
        fieldLastname.setBounds(300, 240, 400, 30);
        add(fieldLastname);

        CustomFieldLabel labelG = new CustomFieldLabel("Gender",Color.BLACK, (new Font("Ralway", Font.BOLD, 20)), 100, 290, 200, 30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBounds(300, 290, 70, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBounds(380, 290, 100, 30);
        add(r2);

        ButtonGroup genderButtonsGroup = new ButtonGroup();
        genderButtonsGroup.add(r1);
        genderButtonsGroup.add(r2);

        CustomFieldLabel DOB = new CustomFieldLabel("Date of Birth",Color.BLACK, (new Font("Ralway", Font.BOLD, 20)), 100, 340, 200, 30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 340, 400, 30);
        add(dateChooser);

        CustomFieldLabel labelEmail = new CustomFieldLabel("Email",Color.BLACK, (new Font("Ralway", Font.BOLD, 20)), 100, 390, 200, 20);
        add(labelEmail);

        fieldEmail = TextFieldFactory.createCustomRoundedTextField(20,(new Font("Ralway", Font.BOLD, 14)), Color.WHITE, Color.BLACK );
        fieldEmail.setBounds(300, 390, 400, 30);
        add(fieldEmail);

        CustomFieldLabel maritalStatus = new CustomFieldLabel("Marital Status",Color.BLACK, (new Font("Ralway", Font.BOLD, 20)), 100, 440, 200, 20);
        add(maritalStatus);


        married = new JRadioButton("Married");
        married.setFont(new Font("Raleway", Font.BOLD, 14));
        married.setBounds(300, 440, 100, 30);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setFont(new Font("Raleway", Font.BOLD, 14));
        unmarried.setBounds(400, 440, 120, 30);
        add(unmarried);

        other = new JRadioButton("Other");
        other.setFont(new Font("Raleway", Font.BOLD, 14));
        other.setBounds(520, 440, 120, 30);
        add(other);

        ButtonGroup maritalStatusButtonsGroup = new ButtonGroup();
        maritalStatusButtonsGroup.add(married);
        maritalStatusButtonsGroup.add(unmarried);
        maritalStatusButtonsGroup.add(other);

        CustomFieldLabel address = new CustomFieldLabel("Address",Color.BLACK, (new Font("Ralway", Font.BOLD, 20)), 100, 490, 200, 20);
        add(address);

        fieldAddress = TextFieldFactory.createCustomRoundedTextField(20,(new Font("Ralway", Font.BOLD, 14)), Color.WHITE, Color.BLACK );
        fieldAddress.setBounds(300, 490, 400, 30);
        add(fieldAddress);

        CustomFieldLabel city = new CustomFieldLabel("City",Color.BLACK, (new Font("Ralway", Font.BOLD, 20)), 100, 540, 200, 20);
        add(city);

        fieldCity = TextFieldFactory.createCustomRoundedTextField(20,(new Font("Ralway", Font.BOLD, 14)), Color.WHITE, Color.BLACK );
        fieldCity.setBounds(300, 540, 400, 30);
        add(fieldCity);

        CustomFieldLabel pin = new CustomFieldLabel("PIN",Color.BLACK, (new Font("Ralway", Font.BOLD, 20)), 100, 590, 200, 20);
        add(pin);

        fieldCity = TextFieldFactory.createCustomRoundedTextField(20,(new Font("Ralway", Font.BOLD, 14)), Color.WHITE, Color.BLACK );
        fieldCity.setBounds(300, 590, 400, 30);
        add(fieldCity);

        CustomFieldLabel state = new CustomFieldLabel("State",Color.BLACK, (new Font("Ralway", Font.BOLD, 20)), 100, 640, 200, 20);
        add(state);

        fieldState = TextFieldFactory.createCustomRoundedTextField(20,(new Font("Ralway", Font.BOLD, 14)), Color.WHITE, Color.BLACK );
        fieldState.setBounds(300, 640, 400, 30);
        add(fieldState);

        RoundedButton nextButton = ButtonFactory.createDefaultRoundedButton("NEXT", 620, 710, 80, 30);
        nextButton.addActionListener(this);
        add(nextButton);

        getContentPane().setBackground(new Color(86, 95, 198));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){

    }
    public static void main(String[] args) {
        new Signup();
    }
}
