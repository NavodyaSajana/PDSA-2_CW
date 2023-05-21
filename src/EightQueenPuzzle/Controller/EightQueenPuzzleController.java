/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EightQueenPuzzle.Controller;

import EightQueenPuzzle.Model.EightQueenPuzzleModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sajana
 */
public class EightQueenPuzzleController {

    EightQueenPuzzleModel model = new EightQueenPuzzleModel();

    public void checkPatterns(String value) {
        Array2D pattern = new Array2D();

        int userArray[][] = new int[8][8];
        int systemArray[][] = new int[8][8];

        userArray = pattern.create(value);

        ResultSet rs = model.getPatterns();
        try {
            boolean isPatternFound = false;
            while (rs.next()) {
                systemArray = pattern.create(rs.getString(2));
                if (pattern.isEqual(systemArray, userArray) == true) {
                    isPatternFound = true;
                    insertPatternFounder(rs.getInt(1));                    
                    break;
                }
            }
            if (!isPatternFound) {
                System.out.println("This pattern is incorrect found");
            } else{
                if(allPatternsFound()){
                    deleteDataFromTable();
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    //delete if all patterns found
    public boolean allPatternsFound() throws SQLException{
        ResultSet rs = model.getPatterns();
        while(rs.next()){
            if(!patternFound(rs.getInt(1))){
                return false;
            }
        }
        return true;
    }
    
    public boolean patternFound(int patternID) throws SQLException{
        ResultSet rs=model.getGamePlayData(patternID);
        return rs.isBeforeFirst();
    }
    
    public void deleteDataFromTable() throws SQLException{
        model.deleteData();
        System.out.println("All patterns have been found. Data deleted from the table.");
        
    }
    
    public void insertPatternFounder(int patternID) throws SQLException {
        ResultSet rs = model.getGamePlayData(patternID);
        if (rs.isBeforeFirst()) {
            //Result Set not null stage
            while(rs.next()){
                System.out.println("This Pattern is correct but this pattern is founded by "+rs.getString(2));
            }            
        } else {
            //Result Set null stage
            ResultSet rs2 = model.getMaxGamePlay();
            String playerName = getUserDetails();
            if(rs2.isBeforeFirst()){
                //Result Set Not null stage                
                String maxPIDStr="";
                while(rs2.next()){
                    maxPIDStr=rs2.getString(1);
                }
                int maxPID=Integer.parseInt(maxPIDStr);
                boolean isSuccess = model.insertPlayer(++maxPID, playerName, patternID);
                if(isSuccess)
                    System.out.println("Your Details have been successfully saved");
                else
                    System.out.println("Something went wrong while saving the data");
            }else{
                //Result Set null stage
                boolean isSuccess = model.insertPlayer(1, playerName, patternID);
                if(isSuccess)
                    System.out.println("Your Details have been successfully saved");
                else
                    System.out.println("Something went wrong while saving the data");
            }
        }
    }

    public String getUserDetails() {
        //this below is to test the codes this will be changes after adding the view
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String playerName = in.nextLine();

        return playerName;
    }
    
//    public void deletePlayerData(int patternID){
//        try{
//            ResultSet rs = model.getGamePlayData(patternID);
//            if(rs.isBeforeFirst()){
//                //resultset not niull
//                while(rs.next()){
//                    int gamePlayID = rs.getInt(1);
//                    boolean isSuccess = model.deletePlayer(gamePlayID);
//                    if(isSuccess){
//                        System.out.println("Data has been successfully deleted.");
//                    } else{
//                        System.out.println("Something went wrong while deleting the data.");
//                    }
//                }
//            } else{
//                //resultset null
//                 System.out.println("No player data found for the given pattern ID.");
//            }
//        }catch(SQLException ex){
//        System.out.println(ex);
//        }
//    }

}
