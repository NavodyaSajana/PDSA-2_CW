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
    
    public void checkPatterns(String value){
        Array2D pattern = new Array2D();
        
        int userArray[][] = new int[8][8];
        int systemArray[][] = new int[8][8];
        
        userArray=pattern.create(value);
        
        ResultSet rs = model.getPatterns();
        try {
            boolean isPatternFound =false;
            while(rs.next()){
                systemArray=pattern.create(rs.getString(2));
                if(pattern.isEqual(systemArray, userArray)==true){
                    System.out.println("Congradulations This is a correct pattern");
                    insertPatternFounder(rs.getInt(1));
                    isPatternFound=true;
                    break;                    
                }
            }
            if(!isPatternFound)
            {
                System.out.println("this pattern is not found");
            }                    
        } catch (SQLException ex) {
            System.out.println(ex);
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
