
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
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
public class records {
    public int listinsert(String fname, String lname, String user, String pass){
        int x = 0;
        String sql = "insert into accountable values(?,?,?,md5(?));";

try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/registration?", "root", "");
    
    PreparedStatement pstmt = con.prepareStatement(sql);
    pstmt.setString(1, fname);
    pstmt.setString(2, lname);
    pstmt.setString(3, user);
    pstmt.setString(4, pass);
    
    pstmt.executeUpdate();
    x=1;
}       catch (ClassNotFoundException ex) {
            x=0;
        } catch (SQLException ex) {
            x=0;
        }

return x;
    }
    public int checkPass(String pass, String cpass){
        int x = 0;
        if(pass.equals(cpass)){
            x=1;
        }else{
            x=0;
        }
        
        
        return x;
    }
    public int checkUser(String uname){
        int x=0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/registration?", "root", "");
            String sql = "select * from accountable where username=?;";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, uname);
            
            ResultSet rs =pstmt.executeQuery();
            if(rs.next()){
                x=1;
            }else{
                x=0;
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(records.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(records.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
        
    }
}
