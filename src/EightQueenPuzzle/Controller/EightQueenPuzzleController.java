/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EightQueenPuzzle.Controller;

import EightQueenPuzzle.Model.EightQueenPuzzleModel;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sajana
 */
public class EightQueenPuzzleController {

    EightQueenPuzzleModel model = new EightQueenPuzzleModel();

    private int patternID = 0;
    private String patternOwner = "";

    public int getPatternID() {
        return patternID;
    }

    public String getPatternOwner() {
        return patternOwner;
    }

    public boolean checkPatterns(String value) throws SQLException, Exception {
        Array2D pattern = new Array2D();
        boolean isPatternFound = false;

        int userArray[][] = new int[8][8];
        int systemArray[][] = new int[8][8];

        userArray = pattern.create(value);

        ResultSet rs = model.getPatterns();
        while (rs.next()) {
            systemArray = pattern.create(rs.getString(2));
            if (pattern.isEqual(systemArray, userArray) == true) {
                isPatternFound = true;
                patternID = rs.getInt(1);
                //insertPatternFounder(rs.getInt(1));                    
                break;
            }
        }
        if (!isPatternFound) {
            System.out.println("This pattern is incorrect");
            isPatternFound = false;
        }
        return isPatternFound;
    }

    //delete if all patterns found
    public boolean allPatternsFound() throws SQLException {
        ResultSet rs = model.getPatterns();
        while (rs.next()) {
            if (!patternFound(rs.getInt(1))) {
                return false;
            }
        }
        return true;
    }

    private boolean patternFound(int patternID) throws SQLException {
        ResultSet rs = model.getGamePlayData(patternID);
        return rs.isBeforeFirst();
    }

    public boolean deleteDataFromTable() throws SQLException {
        return model.deleteData();

    }

    public boolean ifPatternFounded(int patternID) throws SQLException, Exception {
        boolean ifPatternFounded = false;
        ResultSet rs = model.getGamePlayData(patternID);
        if (rs.isBeforeFirst()) {
            ifPatternFounded = false;
            while (rs.next()) {
                System.out.println("This Pattern is correct but this pattern is founded by " + rs.getString(2));
                patternOwner = rs.getString(2);
                ifPatternFounded = true;
            }
        }

        return ifPatternFounded;
    }

    public boolean insertPatternFounder(int patternID, String patternFounder) throws SQLException, Exception {
        boolean isSuccess = false;
        if (!ifPatternFounded(patternID)) {
            //Result Set null stage

            ResultSet rs2 = model.getMaxGamePlay();
            String playerName = patternFounder;
            int maxPID = 0;
            //String playerName = getUserDetails();
            if (rs2.isBeforeFirst()) {
                //Result Set Not null stage                
                String maxPIDStr = "";
                while (rs2.next()) {
                    maxPIDStr = rs2.getString(1);
                }
                if (maxPIDStr != null) {
                    maxPID = Integer.parseInt(maxPIDStr);
                }
                isSuccess = model.insertPlayer(++maxPID, playerName, patternID);
                if (isSuccess) {
                    System.out.println("Your Details have been successfully saved");
                } else {
                    System.out.println("Something went wrong while saving the data");
                }
            } else {
                //Result Set null stage
                isSuccess = model.insertPlayer(1, playerName, patternID);
                if (isSuccess) {
                    System.out.println("Your Details have been successfully saved");
                } else {
                    System.out.println("Something went wrong while saving the data");
                }
            }
        }
        return isSuccess;
    }

    /*private String getUserDetails() {
        //this below is to test the codes this will be changes after adding the view
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String playerName = in.nextLine();

        return playerName;
    }*/
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
    public int getTotPatterns() throws SQLException {
        ResultSet rs = model.getTotPatterns();
        int tot = 0;
        if (rs.isBeforeFirst()) {
            while (rs.next()) {
                tot = rs.getInt("tot");
            }
        }
        return tot;
    }

    public int getTotCompletion() throws SQLException {
        ResultSet rs = model.getTotCompletions();
        int tot = 0;
        if (rs.isBeforeFirst()) {
            while (rs.next()) {
                tot = rs.getInt("tot");
            }
        }
        return tot;
    }

    public String[] getPreviousWinners() throws SQLException {
        ResultSet rs = model.getTotCompletions();
        if (rs.isBeforeFirst()) {
            int arraySize = 0;
            while(rs.next()){
                arraySize = rs.getInt("tot");
            }
            System.out.println(arraySize);
            String[] names = new String[arraySize];
            rs = null;
            rs = model.getWinners();
            int count = 0;
            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    names[count] = rs.getString("name");
                    count++;
                }
            }
            rs.close();
            return names;
        }else{
            return null;
        }        
    }

}
