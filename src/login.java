
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurence
 */
public class login {
    session sess = new session();
    
    public int loginB(String user, String pass){
        int e =0;
         String sql = "select * from accountable where USERNAME=? AND PASSWORD=md5(?);";
         
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/registration?", "root", "");
            
            
            PreparedStatement pstmt = (PreparedStatement)con.prepareStatement(sql);
            pstmt.setString(1, user);
            pstmt.setString(2, pass);
           
           ResultSet rs = pstmt.executeQuery();
           if(rs.next()){
               
           e=1;
          // sess.username=rs.getString("USERNAME");
          // sess.firstname= rs.getString("FIRST_NAME");
           //sess.lastname= rs.getString("LAST_NAME");
           
           
           }
           else{
               e=0;
           }
               
           
        } catch (ClassNotFoundException ex) {
            e=0;
        } catch (SQLException ex) {
           e=0;
        }
        return e;
        
        
    }
}
