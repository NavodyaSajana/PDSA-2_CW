/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EightQueenPuzzle.Model;

import Components.Database;
import java.sql.ResultSet;

/**
 *
 * @author Sajana
 */
public class EightQueenPuzzleModel {
    Database db = new Database();
    
    public ResultSet getPatterns(){
        return db.getData("select * from tbl_pattern");
    }
    
    public boolean insertPlayer(int playerID,String playerName,int patternID){
        return db.insertDeleteUpdate_Data("insert into tbl_e8_gameplay	values ("+playerID+",'"+playerName+"',"+patternID+")");
    }
    
    public ResultSet getGamePlayData(){
        return db.getData("select * from tbl_e8_gameplay");
    }
    
    public ResultSet getGamePlayData(int patternID){
        return db.getData("select * from tbl_e8_gameplay where pattern_ID="+patternID+"");
    }
}
