/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EightQueenPuzzle.Model;

import Components.Database;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sajana
 */
public class EightQueenPuzzleModel {
    Database db = new Database();
    
    public ResultSet getPatterns() throws SQLException{
        return db.getData("select * from tbl_pattern");
    }
    
    public boolean insertPlayer(int playerID,String playerName,int patternID) throws SQLException{
        return db.insertDeleteUpdate_Data("insert into tbl_e8_gameplay	values ("+playerID+",'"+playerName+"',"+patternID+")");
    }
    
    public ResultSet getGamePlayData() throws SQLException{
        return db.getData("select * from tbl_e8_gameplay");
    }
    
    public ResultSet getGamePlayData(int patternID) throws SQLException{
        return db.getData("select * from tbl_e8_gameplay where pattern_ID="+patternID+"");
    }

    public ResultSet getMaxGamePlay() throws SQLException {
        return db.getData("select max(player_id) as max_PID from tbl_e8_gameplay");
    }
    
    public ResultSet getTotPatterns() throws SQLException {
        return db.getData("select count(pattern_id) as tot from tbl_pattern");
    }
    
    public ResultSet getTotCompletions() throws SQLException {
        return db.getData("select count(player_id) as tot from tbl_e8_gameplay");
    }
    
   public boolean deleteData() throws SQLException{
        return db.insertDeleteUpdate_Data("Delete from tbl_e8_gameplay");
   }

    public ResultSet getWinners() throws SQLException {
        return db.getData("select player_name as name from tbl_e8_gameplay");
    }
}
