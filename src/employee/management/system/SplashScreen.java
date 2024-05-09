package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SplashScreen extends JFrame implements ActionListener {

    SplashScreen() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(80, 30, 1200, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.green);
        add(heading);

        ImageIcon obj1 = new ImageIcon(ClassLoader.getSystemResource("icons/employee2.jpg"));
        Image obj2 = obj1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon obj3 = new ImageIcon(obj2);
        JLabel image = new JLabel(obj3);
        image.setBounds(50, 100, 1050, 500);
        add(image);

        JButton btn1 = new JButton("CLICK HERE TO CONTINUE");
        btn1.setBounds(400, 400, 300, 70);
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);
        btn1.addActionListener(this);

        image.add(btn1);

        setSize(1170, 650);
        setLocation(200, 50);
        setVisible(true);

        while (true) {
            heading.setVisible(false); 
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }

            heading.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new LoginPage();
    }

    public static void main(String args[]) {
        new SplashScreen();
    }
}
