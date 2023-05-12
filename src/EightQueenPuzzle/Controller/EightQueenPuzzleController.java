/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EightQueenPuzzle.Controller;

import EightQueenPuzzle.Model.EightQueenPuzzleModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sajana
 */
public class EightQueenPuzzleController {
    EightQueenPuzzleModel model = new EightQueenPuzzleModel();
    
    public void checkPatterns(String value) throws SQLException{
        Array2D pattern = new Array2D();
        
        int userArray[][] = new int[8][8];
        int systemArray[][] = new int[8][8];
        
        userArray=pattern.create(value);
        pattern.display(userArray);
        
        ResultSet rs = model.getPatterns();
        while(rs.next()){
            rs.getString(2);
        }
    }
    
    public void insertPatternFounder(int patternID){
        ResultSet rs = model.getGamePlayData(patternID);
        if(rs!=null){
            try {
                while(rs.next()){
                    System.out.println("This Pattern is Already found by "+rs.getString(2));
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }else{
            //insert data into database
        }
    }
}
