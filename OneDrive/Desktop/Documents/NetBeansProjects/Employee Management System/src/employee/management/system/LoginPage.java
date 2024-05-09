/*package employee.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
*/
/**
 *
 * @author JAGADEESH
 */

       

package employee.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class LoginPage extends JFrame implements ActionListener{
    
    JTextField Tusername,Tpassword;// globally declaration

    LoginPage() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel username1 = new JLabel("Username");
        username1.setBounds(40, 20, 100, 30);
        add(username1);
        Tusername = new JTextField();
        Tusername.setBounds(150, 20, 150, 30);
        add(Tusername);

        JLabel password1 = new JLabel("Password");
        password1.setBounds(40, 70, 100, 30);
        add(password1);
        
        Tpassword = new JPasswordField();
        Tpassword.setBounds(150, 70, 150, 30);
        add(Tpassword);
        
        JButton btn2=new JButton("Login");
        btn2.setBounds(150,140,150,30);
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);
        btn2.addActionListener(this);
        add(btn2);
      
        // Load and set background image
        ImageIcon backgroundIcon = new ImageIcon(ClassLoader.getSystemResource("icons/view.jpg"));
        Image backgroundImage = backgroundIcon.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
        ImageIcon background = new ImageIcon(backgroundImage);
        JLabel backgroundLabel = new JLabel(background);
        backgroundLabel.setBounds(0, 0, 600, 300);
        add(backgroundLabel);
        
        setSize(600, 300);
        setLocation(450, 200);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        try {
            String username=Tusername.getText();
            String password=Tpassword.getText();
            
            Jdbcconnection con=new Jdbcconnection();
            String query1 = "select * from login where username = '"+username+"' and password = '"+password+"'";
            ResultSet rs=con.st.executeQuery(query1);
            if(rs.next()) {
                setVisible(false);
                new Home();
            } else {
                JOptionPane.showMessageDialog(null, "invalid username or password");
                // Clear the password field
                Tpassword.setText("");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new LoginPage(); 
    }
}
