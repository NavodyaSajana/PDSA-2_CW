/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Components;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sajana
 */
public class Database {
    private Connection con=null;
    private Statement stmt=null;
    
    //this method is use to eshtablish the connection between database and application
    public boolean startConnection(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test","root","");
            if(con != null && !con.isClosed())
                return true;
            else
                return false;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR);
            return false;
        }        
    }
    
    /**
     * this method is used to insert data into database 
     * send data under query parameter to insert,update and delete data into the database
     */
    public boolean insertDeleteUpdate_Data(String query){
        startConnection();
        stmt=null;
        if(con !=null){
            try {
                stmt = con.createStatement();
                int i = stmt.executeUpdate(query);
                con.close();
                if(i!=0)
                    return true;
                else
                    return false;
            } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR);
                return false;
            }   
        }else
            return false;
    }
    
    /**
     * this method is used to get data from the database.
     * ResultSet will be returns as the query.
     * It returns null if ResultSet is null.
     */
    public ResultSet getData(String query){
        startConnection();
        stmt=null;
        ResultSet dataSet=null;
        
        if(con!=null){
            try {
                stmt = con.createStatement();
                dataSet = stmt.executeQuery(query);
                if(dataSet!=null)
                    return dataSet;
                else
                    return null;
            } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR);
                return null;
            }           
        }else
            return null;
    }
}
