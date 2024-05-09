
package employee.management.system;



import java.sql.*;



public class Jdbcconnection{
    
    Connection con;
    Statement st;

    public Jdbcconnection () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem", "root", "");
            st = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
