
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurence
 */
public class product_class {
    public int addProduct(String product_name, int quantity, String price){
        int opt = 0;
        String sql = "INSERT INTO addproduct VALUES(null,?,?,?);";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/registration?", "root", "");
            
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, product_name);
            pstmt.setInt(2, quantity);
            pstmt.setString(3, price);
            opt=pstmt.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
         Logger.getLogger(product_class.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
           Logger.getLogger(product_class.class.getName()).log(Level.SEVERE, null, ex);
        }
     return opt;
    }
    
   public int addQuantity(int id, Object quantity){
       int s=0;
       try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/registration?", "root", "");
           PreparedStatement pstmt=con.prepareStatement("update addproduct set QUANTITY=(QUANTITY+ ?) where ID=?");
           pstmt.setObject(1, quantity);
           pstmt.setInt(2, id);
           s=pstmt.executeUpdate();
       } catch (ClassNotFoundException ex) {
            Logger.getLogger(product_class.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(product_class.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
       return s;
       
   }
}
